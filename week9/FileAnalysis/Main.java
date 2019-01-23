import file.Analysis;
import java.io.File;
import java.util.*;


public class Main {

	public static void main(String[] args) throws Exception {
	    File file = new File("test/File.txt");
	    Analysis analysis = new Analysis(file);
	    System.out.println("Lines: " + analysis.lines());
	    System.out.println("Characters: " + analysis.characters());
	}
}