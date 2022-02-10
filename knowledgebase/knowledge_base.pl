/*
['c:/programs/java/csintsy-mco3/knowledgebase/knowledge_base.pl'].
*/

/* PROFILE INFORMATION */
mustBeFullyVaccinated(IsCanadian, IsForeigner, IsWorker) :-
    IsCanadian; IsForeigner; IsWorker.

mustBeFullyVaccinated(IsWorker, IsJobExempted) :-
    (   IsWorker, IsJobExempted
    ->  false
    ;   true
    ).

underFive(Age) :- Age < 5.
minor(Age) :- Age >= 5, Age =< 18.

isInList([H|T], H).
isInList([_|T], H) :- isInList(T, H).

isValidVaccine(X):-
    ValidVaccines = [pfizer, covaxin, astrazeneca, jannsen, moderna, sinovac, sinopharm],
    isInList(ValidVaccines, X).

isFullDoseOfValidVaccines(Doses, Vaccine):-
    Doses >= 2, isValidVaccine(Vaccine).

isFullDoseOfValidVaccines(Doses, 'jannsen') :-
    Doses >= 1.

isLastDose14DaysBefore(DaysSinceLastDose):-
    DaysSinceLastDose >= 14.

isNoSymptoms(true):- true.

fullyVaccinated(Doses, Vaccine, DaysSinceLastDone, NoSymptoms) :-
    (   isFullDoseOfValidVaccines(Doses, Vaccine),
        isLastDose14DaysBefore(DaysSinceLastDone),
        isNoSymptoms(NoSymptoms)
    ->  true
    ).


/* TRAVEL REQUIREMENTS */
mustSubmitInfoToArriveCan(true) :- true.
mustProvideProofVaccination(true) :- true.
mustProvideNegativeMolecularTest(true) :- true.
mustProvideArriveCanReceipt(true) :- true.
mustHaveQuarantinePlan(true) :- true.
mustBringTravelDocument(true) :- true.
mustRegisterArrivalTesting(true) :- true.

mustBeAccompaniedByFullyVaxedAdult(Age) :- minor(Age).

/* TRAVEL RULES */
possibleArrivalTestingQuarantine(true) :- true.

mustFollowRulesForMinors(Age) :- minor(Age).

exemptPreEntryTest(Age) :- underFive(Age).
exemptArrivalTest(Age) :- underFive(Age).
exemptDay8Test(Age) :- underFive(Age).
