
/* PROFILE INFORMATION */
isInList([H|T], H).
isInList([_|T], H) :- isInList(T, H).

isValidVaccine(X):-
    ValidVaccines = [pfizer, astrazeneca, jannsen, moderna, sinovac],
    isInList(ValidVaccines, X).

isFullDoseOfValidVaccines(Doses, Vaccine):-
    Doses >= 2, isValidVaccine(Vaccine).

isLastDose14DaysBefore(DaysSinceLastDose):-
    DaysSinceLastDose =< 14.

isNoSymptoms(true):- true.
isNoSymptoms(false) :- false.

mustBeFullyVaccinated(true) :- true.

/* IF traveller is a Canadian citizen THEN traveller must be fully vaccinated to travel to Canada */
canadian(true):- mustBeFullyVaccinated(true).

/* IF traveller is a foreign nationale THEN traveller must be fully vaccinated to travel to Canada */
foreigner(true) :-  mustBeFullyVaccinated(true).

/* IF received full dose of any valid vaccines and last dose was 14 days before arrival in Canada and show no symptoms of COVID-19 THEN traveler is fully vaccinated */
fullyVaccinated(Doses, Vaccine, DaysSinceLastDone, NoSymptoms) :-
    (   isFullDoseOfValidVaccines(Doses, Vaccine),
        isLastDose14DaysBefore(DaysSinceLastDone),
        isNoSymptoms(NoSymptoms)
    ->  true
    ).

/* TRAVEL REQUIREMENTS */
increment(NewI, I) :-
    NewI is I + 1.

infoCheckRec(I, Eligibility) :-
    infoCheck(I, Eligibility),
    increment(NewI, I), write(I), write(" "),
    (   I =< 7 -> infoCheckRec(NewI, Eligibility) ).

infoCheck(I, Eligibility):-
    (   I = 0
    ->  mustSubmitInfoToArriveCan(Eligibility)
    ;   I = 1
    ->  mustProvideProofVaccination(Eligibility)
    ;   I = 2
    ->  mustProvideNegativeMolecularTest(Eligibility)
    ;   I = 3
    ->  mustProvideArriveCanReceipt(Eligibility)
    ;   I = 4
    ->  mustHaveQuarantinePlan(Eligibility)
    ;   I = 5
    ->  mustBringTravelDocument(Eligibility)
    ;   I = 6
    ->  mustRegisterArrivalTesting(Eligibility)
    ;   I = 7
    ->  possibleArrivalTestingQuarantine(Eligibility)
    ).

/* IF traveller qualifies as fully vaccinated THEN traveller must submit profile information and travel details to ArriveCan */
mustSubmitInfoToArriveCan(true) :- true.
mustSubmitInfoToArriveCan(false) :- false.

/* IF traveller qualifies as fully vaccinated THEN traveller must provide proof of vaccination that was also submitted to ArriveCan */
mustProvideProofVaccination(true) :- true.
mustProvideProofVaccination(false) :- false.

/* IF traveller qualifies as fully vaccinated THEN traveller must provide a valid negative molecular test result */
mustProvideNegativeMolecularTest(true) :- true.
mustProvideNegativeMolecularTest(false) :- false.

/* IF traveller qualifies as fully vaccinated THEN traveller must provide an ArriveCan receipt with letter I, V, or A, beside the traveller�s name */
mustProvideArriveCanReceipt(true) :- true.
mustProvideArriveCanReceipt(false) :- false.

/* IF traveller qualifies as fully vaccinated THEN traveller must have a quarantine plan */
mustHaveQuarantinePlan(true) :- true.
mustHaveQuarantinePlan(false) :- false.


/* IF traveller qualifies as fully vaccinated THEN traveller must bring the travel document that was submitted to ArriveCan */
mustBringTravelDocument(true) :- true.
mustBringTravelDocument(false) :- false.

/* IF traveller qualifies as fully vaccinated THEN traveller must register in advance for arrival testing */
mustRegisterArrivalTesting(true) :- true.
mustRegisterArrivalTesting(false) :- false.

/* TRAVEL RULES */

/* IF traveller qualifies as fully vaccinated THEN then traveller may be randomly selected for a mandatory arrival test and must quarantine while waiting for results */
possibleArrivalTestingQuarantine(true) :- true.
possibleArrivalTestingQuarantine(false) :- false.

