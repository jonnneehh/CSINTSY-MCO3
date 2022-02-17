package system;

public class Main {

	public static void main(String[] args) {
		Predicates p = new Predicates();
		ConsoleUI c = new ConsoleUI();
		
		p.compile();
		
		//1
		boolean isCanadian = c.askCitizenship();
		
		//2
		int age = c.askAge();
		
		boolean accompanied, wasPositive;
		if(age < 12) {
			accompanied = c.askIsAccompanied(); 	//2a
			wasPositive = c.askHasTestedPositive(); //2b
		}
		
		String vaccine = c.askVaccineType(); //3
		int doses = c.askNumOfDoses();//3a
		
		boolean symptoms = c.askIfNoSymptoms(); //4
		int daysSinceDose = c.askDaysSinceLastDose(); //5
		
		boolean employedInCanada = c.askIsEmployedInCanada(); //6
		boolean hasWorkPermit = c.askHasWorkPermit(); //6a
		
		if(!hasWorkPermit) {
			if(c.askIsEmergencyProvider()) {
				hasWorkPermit = true;
			}
		}
		
		
	}
}
