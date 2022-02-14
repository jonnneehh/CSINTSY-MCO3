package system;

import java.util.Map;

import org.jpl7.*;

public class Predicates {
	public void compile() {
		
		//CHANGE THIS TO YOUR OWN DIRECTORY
		String t = "consult('c:/users/dell/documents/programs/java/csintsy-mco3/knowledgebase/knowledge_base.pl')";
		Query q = new Query(t);
		
		q.hasSolution(t);
		
	}
	
	public boolean fullyVaccinated(int doses, String vaccine, int daysSinceLastDose, boolean noSymptoms) {
		String str = "fullyVaccinated(" + doses + "," + vaccine + "," + daysSinceLastDose + "," + noSymptoms + ")";
		Query q = new Query(str);
		
		return q.hasSolution(str);
	}
	
	public boolean underFive(int age) {
		String str = "underFive(" + age + ")";
		Query q = new Query(str);
		
		return q.hasSolution(str);
	}
	
	public boolean minor(int age) {
		String str = "minor(" + age + ")";
		Query q = new Query(str);
		
		return q.hasSolution(str);
	}
	
	public boolean mustBeFullyVaccinated(boolean isCanadian, boolean isForeigner, boolean isWorker) {
		String str = "mustBeFullyVaccinated(" + isCanadian + "," + isForeigner + "," + isWorker + ")";
		Query q = new Query(str);
		
		return q.hasSolution(str);
	}
	
	public boolean mustBeFullyVaccinated(boolean isWorker, boolean isJobExempted) {
		String str = "mustBeFullyVaccinated(" + isWorker + "," + isJobExempted + ")";
		Query q = new Query(str);
		
		return q.hasSolution(str);
	}
}
