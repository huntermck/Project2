
public class LetterAvg {

	public String toString() {
		String mesoOutput = "\nThey are:\n";
		for(int i = 0; i < avgLetterStations.size(); ++i) {
			if (i < (avgLetterStations.size()) -1) {
				mesoOutput += avgLetterStations.get(i) + "\n";
			} else {
				mesoOuput += avgLetterStations.get(i);
			}
		}
		return mesoOutput;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
