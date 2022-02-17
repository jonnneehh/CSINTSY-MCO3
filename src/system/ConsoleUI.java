package system;

import java.util.Scanner;

public class ConsoleUI {

	// PROFILE QUESTIONS
	public boolean askCitizenship() {
		Scanner sc = new Scanner(System.in);
		char response;
		boolean isCanadian = false;

		System.out.print("Are you a Canadian citizen?: ");

		do {
			response = sc.nextLine().charAt(0);

			if(response == 'Y' || response == 'y') {
				isCanadian = true;
			}

			if(response != 'Y' && response != 'y' && response != 'N' && response != 'n') {
				System.out.println("\nPlease enter Y or N as a response");
			}

		} while(response != 'Y' && response != 'y' && response != 'N' && response != 'n');

		return isCanadian;
	}

	public int askAge() {
		Scanner sc = new Scanner(System.in);

		System.out.print("What is your age?: ");
		int age = sc.nextInt();

		return age;
	}

	// this question will only be asked if user is < 18 years old
	public boolean askIsAccompanied() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Are you accompanied by a fully vaccinated adult? (Y/n): ");
		char response;
		boolean hasAdult = false;

		do {
			response = sc.nextLine().charAt(0);

			if(response == 'Y' || response == 'y') {
				hasAdult = true;
			}

			if(response != 'Y' && response != 'y' && response != 'N' && response != 'n') {
				System.out.println("\nPlease enter Y or N as a response");
			}

		} while(response != 'Y' && response != 'y' && response != 'N' && response != 'n');

		return hasAdult;
	}

	// this question will only be asked if user is < 18 years old
	public boolean askHasTestedPositive() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Do you have a positive COVID-19 test (taken 11 to 180 days prior to your entry to Canada) (Y/n): ");
		char response;
		boolean wasPositive = false;

		do {
			response = sc.nextLine().charAt(0);

			if(response == 'Y' || response == 'y') {
				wasPositive = true;
			}

			if(response != 'Y' && response != 'y' && response != 'N' && response != 'n') {
				System.out.println("\nPlease enter Y or N as a response");
			}

		} while(response != 'Y' && response != 'y' && response != 'N' && response != 'n');

		return wasPositive;
	}

	public String askVaccineType() {
		Scanner sc = new Scanner(System.in);

		// 1 - 6 need 2 doses, 7 needs 1, and 8 - 9 are not permitted to travel
		System.out.print("Which vaccine did you take?:\n" +
				"\t [1] AstraZeneca/COVISHIELD (ChAdOx1-S, Vaxzevria, AZD1222)\n" +
				"\t [2] Bharat Biotech (Covaxin, BBV152 A, B, C)\n" +
				"\t [3] Moderna (mRNA-1273)\n" +
				"\t [4] Pfizer-BioNTech (Comirnaty, tozinameran, BNT162b2)\n" +
				"\t [5] Sinopharm BIBP (BBIBP-CorV)\n" +
				"\t [6] Sinovac (CoronaVac, PiCoVacc)\n" +
				"\t [7] Janssen/Johnson & Johnson\n" +
				"\t [8] Other\n" +
				"\t [9] None\n" +
				"Response: ");

		int response = sc.nextInt();
		
		String vaccine;
		
		if(response == 1) vaccine = "astrazeneca";
		else if (response == 2) vaccine = "covaxin";
		else if (response == 3) vaccine = "moderna";
		else if (response == 4) vaccine = "pfizer";
		else if (response == 5) vaccine = "sinopharm";
		else if (response == 6) vaccine = "sinovac";
		else if (response == 7) vaccine = "jannsen";
		else if (response == 8) vaccine = "other";
		else vaccine = "none";
		
		return vaccine;
	}
	
	public int askNumOfDoses() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your number of doses (including booster shots): ");
		int dose = sc.nextInt();
		
		return dose;
	}
	
	public int askDaysSinceLastDose() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Days since your last dose: ");
		int days = sc.nextInt();
		
		
		return days;
	}
	
	public boolean askIfNoSymptoms() {
		Scanner sc = new Scanner(System.in);
		char c = '\0';
		boolean isNoSymptoms = false;
		
		while(c != 'Y' && c != 'y' && c != 'N' && c != 'n') {
			System.out.print("Do you have any symptoms of COVID (Y/n)? ");
			c = sc.next().charAt(0);
			
			if(c == 'Y' || c == 'y') {
				isNoSymptoms = false; //User is false for NoSymptoms
			}
			else if(c == 'N' || c == 'n'){
				isNoSymptoms = true; //User is true for NoSymptoms
			}
		}
		
		return isNoSymptoms;
	}

	public boolean askIsEmployedInCanada() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Are you currently employed in Canada? (Y/n): ");
		char response;
		boolean isEmployed = false;

		do {
			response = sc.nextLine().charAt(0);

			if(response == 'Y' || response == 'y') {
				isEmployed = true;
			}

			if(response != 'Y' && response != 'y' && response != 'N' && response != 'n') {
				System.out.println("\nPlease enter Y or N as a response");
			}

		} while(response != 'Y' && response != 'y' && response != 'N' && response != 'n');

		return isEmployed;
	}

	// this question will only be asked if user is employed in canada
	public boolean askHasWorkPermit() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Do you have a work permit? (Y/n): ");
		char response;
		boolean hasPermit = false;

		do {
			response = sc.nextLine().charAt(0);

			if(response == 'Y' || response == 'y') {
				hasPermit = true;
			}

			if(response != 'Y' && response != 'y' && response != 'N' && response != 'n') {
				System.out.println("\nPlease enter Y or N as a response");
			}

		} while(response != 'Y' && response != 'y' && response != 'N' && response != 'n');
		
		return hasPermit;
	}

	// this question will only be asked if user does not have a permit
	public boolean askIsEmergencyProvider() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Do you qualify as any of the following occupations?:\n" +
				"\t - Marine Crew Member\n" +
				"\t - Work with medical equipment or devices\n" +
				"\t - In the agricultural or food processing industry\n" +
				"Response (Y/n): ");
		char response;
		boolean isExemptWorker = false;

		do {
			response = sc.nextLine().charAt(0);

			if(response == 'Y' || response == 'y') {
				isExemptWorker = true;
			}

			if(response != 'Y' && response != 'y' && response != 'N' && response != 'n') {
				System.out.println("\nPlease enter Y or N as a response");
			}

		} while(response != 'Y' && response != 'y' && response != 'N' && response != 'n');

		return isExemptWorker;
	}
	
	// OUTPUTS
	public boolean isFullyVaccinated(int doses, String vaccine, int daysSinceLastDose, boolean noSymptoms) {
		Predicates p = new Predicates();
		boolean isFullyVaccinated = false;
		
		if(p.fullyVaccinated(doses, vaccine, daysSinceLastDose, noSymptoms)){
			System.out.println("You are fully vaccinated");
			isFullyVaccinated = true;
		}
		else {
			System.out.println("You are NOT fully vaccinated");
			isFullyVaccinated = false;
		}
		
		return isFullyVaccinated;
	}

	public void printFullyVaccinatedRequirements(boolean isCanadian) {

		System.out.println("You must prepare the following: \n" +
				"\t - Submit your travel details to ArriveCan\n" +
				"\t - Proof of vaccination that was uploaded to ArriveCan\n" +
				"\t\t - If proof is not in English or French, travelers must secure a certified translation \n" +
				"\t\t   in English or French. Translation must include the stamp or membership number \n" +
				"\t\t   of a professional translation association.\n" +
				"\t - COVID-19 Negative Molecular Test Result OR\n" +
				"\t\t - proof of a previous positive test result taken between 10 and 180 days ago\n" +
				"\t\t - proof must include the following information\n" +
				"\t\t\t - Traveller name and birthdate\n" +
				"\t\t\t - Name and civic address of the laboratory/clinic/facility that administered the test\n" +
				"\t\t\t - The date on which the test was taken\n" +
				"\t\t\t - The type of test taken\n" +
				"\t\t\t - The test result\n" +
				"\t - ArriveCan Receipt with letter I, or V, or A beside the traveler's name\n" +
				"\t - Have a quarantine plan\n" +
				"\t - Travel document that was entered in ArriveCan (i.e. passport)\n" +
				"\t - Register in advance for arrival testing");

		if(!isCanadian)
			System.out.println("\t - Valid Canadian Visa");

		System.out.println("Upon Arrival in Canada: \n" +
				"\t - You may be randomly selected for a mandatory arrival test, \n" +
				"\t   if you hadn't registered for arrival testing, so travellers are\n" +
				"\t   strongly encouraged to pre-register for arrival testing to avoid delays\n" +
				"\t - Take the arrival test as directed on the day you enter Canada. \n" +
				"\t   The test may be administered at the airport or you may receive a \n" +
				"\t   self-swab kit at the airport or land border to complete within 24 \n" +
				"\t   hours after entering Canada\n" +
				"\t - You can take connecting flights to your place of quarantine\n" +
				"\t - You must quarantine in a suitable place while you await the arrival test result\n" +
				"\t - You are not required to pay a fee for the arrival test\n" +
				"\t - If you registered for Arrival Testing in advance: \n" +
				"\t - If you receive a positive test result, you will be asked to quarantine for 10 days more\n" +
				"\t - If you receive a negative result:\n" +
				"\t\t - You may leave quarantine\n" +
				"\t\t - Follow public health measures\n" +
				"\t\t - wear a mask when in public spaces for the first 14 days after your entry;\n" +
				"\t\t - maintain a list of all close contacts and locations you visit for your first 14 days in Canada\n" +
				"\t\t - monitor yourself for signs and symptoms\n" +
				"\t\t - keep copies of your proof of vaccination and pre-arrival tests for 14 days");
	}
}
