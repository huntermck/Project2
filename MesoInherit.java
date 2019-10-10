import java.io.BufferedReader;
import java.io.IOException;

public class MesoInherit extends MesoAbstract {

	// Test variables for output.
	private int letterAverageTemp = 73;
	
	// Class variables.
	public static int[] asciiCodes = new int[4];
	double asciiAverage = 0.0;

	// Creates array to return average list.
	int[] averageValueList = new int[3];

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
		// Initialization of avg value.
		Double asciiTotal = 0.0;

		// For loop that uses ascii values from mesoStation and finds the sum.
		for (int i = 0; i < 4; i++) {
			asciiTotal += asciiCodes[i];
		}

		// Divides total value by 4 to find average.
		asciiAverage = asciiTotal / 4;

		// Assigns average value to final index in array.
		averageValueList[2] = (int) Math.round(asciiAverage);

		// Initialization of ascii ceiling value.
		int asciiTop = 0;
		asciiTop = (int) Math.round(asciiAverage);

		// Assigns ceiling value to first index of array.
		averageValueList[0] = asciiTop;

		// Initialization of ascii floor value.
		int asciiBottom = 0;
		asciiBottom = (int) asciiAverage;

		// Assigns floor value to second index of array.
		averageValueList[1] = asciiBottom;

		// Returns averageValueList array.
		return averageValueList;
	}

	public char letterAverage() {
		//return (char) averageValueList[2];
		return (char) letterAverageTemp;
	}

}
