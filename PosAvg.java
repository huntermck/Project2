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

	public PosAvg(String str) {
		this.str = str;
	}

	public int indexOfStation() {
		String temp1 = "";
		int index = 0;
		for (int i = 0; i < mesoList.size(); ++i) {
			temp1 = mesoList.get(i);
			if (str.equals(temp1)) {
				index = mesoList.indexOf(temp1);
			}
		}
		return index + indexOfStationTemp;
	}

	// Reads in MesoNet.txt.
	public void readFile(String fileName) throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		mesoList = br.readLine();
	}
	
	public String toString() {
		return indexAverageTemp;
	}
}
