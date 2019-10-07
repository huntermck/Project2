import java.io.BufferedReader;
import java.io.IOException;

public class MesoInherit extends MesoAbstract {
	
	// Class variables.
	public static int[] asciiCodes = new int[4];
	double asciiAverage = 0.0;

	// Creates array to return average list.
	int[] averagesValueList = new int[3];

	public MesoInherit(MesoStation mesoStation) throws IOException {
		// Fetches station ID.
		String station = mesoStation.getStID();

		// Splits array into individual chars.
		String[] stationSplit = station.split("(?!^)");

		// Finds ASCII for each char in array.
		char[] charList = new char[4];

		for (int i = 0; i < charList.length; i++) {
			charList[i] = stationSplit[i].charAt(0);
		}

		// Uses char value to determine ASCII values.
		for (int i = 0; i < asciiCodes.length; i++) {
			asciiCodes[i] = charList[i];
		}
	}

	public int[] calAverage() {
		return averagesValueList;
		
	}
	
	public static void main(String[] args) {

	}

}
