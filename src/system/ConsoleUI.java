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

	// this question will only be asked if user is < 12 years old
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

	// this question will only be asked if user is < 12 years old
	public boolean askHasTestedPositive() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Have you tested positive for COVID-19 (15 to 180 days prior to your entry to Canada) (Y/n): ");
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

	public int askVaccineType() {
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
	
		return response;
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

		System.out.print("Are you an emergency service provider? (Y/n): ");
		char response;
		boolean isEmergency = false;

		do {
			response = sc.nextLine().charAt(0);

			if(response == 'Y' || response == 'y') {
				isEmergency = true;
			}

			if(response != 'Y' && response != 'y' && response != 'N' && response != 'n') {
				System.out.println("\nPlease enter Y or N as a response");
			}

		} while(response != 'Y' && response != 'y' && response != 'N' && response != 'n');

		return isEmergency;
	}

	// this question will only be asked if user does not have a permit
	public boolean askHasNationalInterest() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Do you have a national interest exemption? (Y/n): ");
		char response;
		boolean isNationalInterest = false;

		do {
			response = sc.nextLine().charAt(0);

			if(response == 'Y' || response == 'y') {
				isNationalInterest = true;
			}

			if(response != 'Y' && response != 'y' && response != 'N' && response != 'n') {
				System.out.println("\nPlease enter Y or N as a response");
			}

		} while(response != 'Y' && response != 'y' && response != 'N' && response != 'n');

		return isNationalInterest;
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
}
