import java.util.ArrayList;

public class PosAvg {
	
	// Variables and arrays.
	private String str;
	private String temp;
	ArrayList<String> mesoList = new ArrayList<String>();
	
	// Default.
	public PosAvg() {
		
	}
	
	public PosAvg(String str) {
		this.str = str;
	}
	
	public int indexOfStation() {
		String temp1 = "";
		int index = 0;
		for(int i = 0; i < mesoList.size(); ++i) {
			temp1 = mesoList.get(i);
			if(str.equals(temp1)) {
				index = mesoList.indexOf(temp1);
			}
		}
		return index;
	}
	
	// Reads in MesoNet.txt.
	public void readFile(String fileName) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
