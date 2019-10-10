import java.util.ArrayList;

public class LetterAvg {
	// Placeholder variables for output.
	private int numStationsTemp = 2;
	private String letterStationTemp = "IDAB" + "\nINOL";
	
	ArrayList<String> avgLetterStations = new ArrayList<String>();

	public LetterAvg(char letterAverage) {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String mesoOutput = "\nThey are:\n";
		for (int i = 0; i < avgLetterStations.size(); ++i) {
			if (i < (avgLetterStations.size()) - 1) {
				mesoOutput += avgLetterStations.get(i) + "\n";
			} else {
				mesoOutput += avgLetterStations.get(i);
			}
		}
		return mesoOutput + letterStationTemp;
	}

	public int numberOfStationWithLetterAvg() {
		// TODO Auto-generated method stub
		return numStationsTemp;
	}

}
