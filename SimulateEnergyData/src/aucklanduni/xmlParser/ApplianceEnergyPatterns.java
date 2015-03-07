package aucklanduni.xmlParser;

/*This class is created to help the function readApplianceEnergyPatternsFromFile() in Simulation.java
 * to return multiple values
 * Hence this class is hand in hand with simulation.java
 * Attributes: All the attributes in this class are the return values of the function readApplianceEnergyPatternsFromFile() 
 * as it returns three values
 */
public class ApplianceEnergyPatterns {
	String[] applianceIds;
	String[] energyUsagePatterns;
	int numberOfAppliances;
	
	public ApplianceEnergyPatterns(String[] a, String[] e, int n)//constructor
	{
		numberOfAppliances = n;
		applianceIds = a;
		energyUsagePatterns = e;
	}
	/*getters*/
	public int getNumberOfAppliances() {
		return numberOfAppliances;
	}

	public String[] getApplianceIds() {
		return applianceIds;
	}

	public String[] getEnergyUsagePatterns() {
		return energyUsagePatterns;
	}	
}
