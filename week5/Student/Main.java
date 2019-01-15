import java.util.*;

public class Main {

	private static boolean addStudentsBool = true;

	private static ArrayList<Student> list = new ArrayList<Student>();

	public static void addStudents(String name, String studentNumber) {
		Student newStudent = new Student(name, studentNumber);
		list.add(newStudent);
	}



	public static void askForStudentDetals() {
    	Scanner readLine = new Scanner(System.in);
		System.out.println("name: ");
    	String name = readLine.nextLine();
    	System.out.println("studentnumber: ");
       	String studentNumber = readLine.nextLine();
       	if(name.equals("")) {
       		addStudentsBool = false;
       	} else {
       		addStudents(name, studentNumber);
       	}
	}

	public static void checkForAddingStudents() {
		while(addStudentsBool == true) {
			askForStudentDetals();
		}
	}

	public static void printStudents() {
		for(Student student : list) {
			System.out.println(student);
		}
	}

	public static void searchUsers() {
    	Scanner readLine = new Scanner(System.in);
		System.out.println("Give search term: ");
    	String search = readLine.nextLine();
    	System.out.println("Result: ");
    	for(Student student : list) {
    		if (student.getName().contains(search)) {
    			System.out.println(student);
    		}
    	}
	}

    public static void main(String[] args) {
    	askForStudentDetals();
    	checkForAddingStudents();
        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);
        printStudents();
        searchUsers();
    }
}
 