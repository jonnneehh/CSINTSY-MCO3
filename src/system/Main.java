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
		
		boolean accompanied = false, wasPositive = false;
		if(p.minor(age) || p.underFive(age)) {
			accompanied = c.askIsAccompanied(); 	//2a
			wasPositive = c.askHasTestedPositive(); //2b
		}
		
		String vaccine = c.askVaccineType(); //3
		int doses = 0, daysSinceDose = 0;
		if(vaccine != "none") {
			doses = c.askNumOfDoses();//3a
			daysSinceDose = c.askDaysSinceLastDose(); //3b
		}
		
		boolean noSymptoms = c.askIfNoSymptoms(); //4
		
		boolean employedInCanada = c.askIsEmployedInCanada(); //5
		boolean hasWorkPermit = false;
		boolean isExemptedWorker = false;
		if(employedInCanada) {
			c.askHasWorkPermit(); //5a
			if(!hasWorkPermit) {
				if(c.askIsEmergencyProvider()) {
					isExemptedWorker = true;
				}
			}
		}
		
		c.outputResult(age, doses, vaccine, daysSinceDose, noSymptoms, employedInCanada, hasWorkPermit, wasPositive, isCanadian, isExemptedWorker, accompanied);	
	}
}
