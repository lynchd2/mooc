import java.util.*;
import java.io.File;

public class Printer {

	private File file;

	public Printer(String fileName) throws Exception {
		this.file = new File(fileName);
	}

	public void printLinesWhichContain(String word) throws Exception {
		Scanner scan = new Scanner(this.file);
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			if(line.contains(word)) {
				System.out.println(line);
			}
		}
		return;
	}

	public static void main(String[] args) throws Exception {
	    Printer printer = new Printer("File.txt");

	    printer.printLinesWhichContain("Väinämöinen");
	    System.out.println("-----");
	    printer.printLinesWhichContain("Frank Zappa");
	    System.out.println("-----");
	    printer.printLinesWhichContain("");
	    System.out.println("-----");	
	}
}