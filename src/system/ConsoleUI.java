package system;

import java.util.Scanner;

public class ConsoleUI {
	public String askVaccineType() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your type of vaccine: ");
		String str = sc.next();
	
		return str;
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
