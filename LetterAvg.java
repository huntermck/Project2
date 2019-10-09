import java.util.ArrayList;

public class LetterAvg {
	ArrayList<String> avgLetterStations = new ArrayList<String>();
	
	public LetterAvg(char letterAverage) {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String mesoOutput = "\nThey are:\n";
		for(int i = 0; i < avgLetterStations.size(); ++i) {
			if (i < (avgLetterStations.size()) -1) {
				mesoOutput += avgLetterStations.get(i) + "\n";
			} else {
				mesoOutput += avgLetterStations.get(i);
			}
		}
		return mesoOutput;
	}

	public String numberOfStationWithLetterAvg() {
		// TODO Auto-generated method stub
		return null;
	}

}
