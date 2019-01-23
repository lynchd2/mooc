package file;

import java.io.File;
import java.util.*;

public class Analysis {

	private File file;
	
	public Analysis(File file) throws Exception {
		this.file = file;
	}	

	public int lines() throws Exception {
		int totalLines = 0;
		Scanner scan = new Scanner(this.file);
		while(scan.hasNextLine()) {
			scan.nextLine();
			totalLines ++;	
		}
		return totalLines;
	}

	public int characters() throws Exception {
		int totalCharacters = 0;
		Scanner scan = new Scanner(this.file);
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			totalCharacters = totalCharacters + line.length();	
		}
		return totalCharacters;
	}

}