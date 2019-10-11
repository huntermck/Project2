import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class PosAvg {

	// Placeholder variables for output.
	private int indexOfStationTemp = 79;
	private String indexAverageTemp = "This index is average of OILT and OKEM, NRMN and OKMU, and so on.";
	
	// Variables and arrays.
	private String str;
	private String temp;
//	ArrayList<String> mesoList = new ArrayList<String>();
	String[] mesoList2 = new String[120];

	public PosAvg(String str) {
		this.str = str;
	}

	public int indexOfStation() {
		String stationMatch = "";
		int index = 0;
		for (int i = 0; i < mesoList2.length; ++i) {
//			stationMatch = mesoList.get(i);
			stationMatch = mesoList2[i];
			if (str.equals(stationMatch)) {
//				index = mesoList.indexOf(stationMatch);
				index
			}
		}
		return index + indexOfStationTemp;
	}

	// Reads in MesoNet.txt.
	public void readFile(String fileName) throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
	}
	
	public String toString() {
		return indexAverageTemp;
	}
}
