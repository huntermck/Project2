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
	ArrayList<String> mesoList = new ArrayList<String>();
	String[] mesoList2 = new String[120];
	
	// Testing variables
	String stID = "OKCE";

	public PosAvg(String str) {
		this.str = str;
	}

	public int indexOfStation() {
		int index = 0;
		for (int i = 0; i < mesoList.size(); ++i) {
//			stationMatch = mesoList.get(i);
			String stationMatch = mesoList.get(i);
			if (stationMatch.equals(stID)) {
//				index = mesoList.indexOf(stationMatch);
				index = i;
				
			}
		}
		return index + indexOfStationTemp;
	}

	// Reads in MesoNet.txt.
	public void readFile(String fileName) throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		
	}
	
	public String toString() {
//		String stat2Below = file.get(indexOfStation() - 2);
//		String stat1Below = file.get(indexOfStation() - 1);
//		String stat1Above = file.get(indexOfStation() + 1);
//		String stat2Above = file.get(indexOfStation() + 2);
//		
//		return String.format("This index is average of ", arg1);
		
		return indexAverageTemp;
	}
}
