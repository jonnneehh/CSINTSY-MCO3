package system;

import java.util.Map;

import org.jpl7.*;

public class Predicates {
	public void compile() {
		
		String t = "consult('c:/users/dell/documents/programs/java/csintsy-mco3/knowledgebase/knowledge_base.pl')";
		Query q = new Query(t);
		
		q.hasSolution(t);
		
	}
	
	public boolean fullyVaccinated(int doses, String vaccine, int daysSinceLastDose, boolean noSymptoms) {
		String str = "fullyVaccinated(" + doses + "," + vaccine + "," + daysSinceLastDose + "," + noSymptoms + ")";
		Query q = new Query(str);
		
		return q.hasSolution(str);
	}
}
