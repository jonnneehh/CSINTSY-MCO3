package system;

public class Main {

	public static void main(String[] args) {
		Predicates p = new Predicates();
		ConsoleUI c = new ConsoleUI();
		
		p.compile();

		int doses = c.askNumOfDoses();
		int daysSinceLastDose = c.askDaysSinceLastDose();
		String vaccineType = c.askVaccineType();
		boolean noSymptoms = c.askIfNoSymptoms();
		
		System.out.println(c.isFullyVaccinated(doses, vaccineType, daysSinceLastDose, noSymptoms));
	
	}
}
