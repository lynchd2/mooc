public class Printing {

	public static void main(String[] args) {
		//printingSquare(5);
		//printingRectangle(10,2);
		//printingTriangle(10);
		//printTriangle(10);
		xmasTree(20);
	}

	public static void printingStars(int numberOfStars) {
		String stars = "";
		for(int i = 0; i < numberOfStars;i++) {
			stars = stars + "*";
		}
		System.out.println(stars); 
	}

	public static void printingSquare(int sideSize) {
		for(int i = 0; i < sideSize;i++) {
			printingStars(sideSize);
		}		
	}

	public static void printingRectangle(int width, int height) {
		for(int i = 0; i < height;i++) {
			printingStars(width);
		}
	}

	public static void printingTriangle(int size) {
		for(int i = 0; i < size;i++){
			printingStars(i);
		}
	}

	public static void printWhiteSpaces(int size) {
		String spaces = "";
		for(int i = 0; i < size;i++) {
			spaces = spaces + " ";
		}
		System.out.print(spaces);
	}

	public static void printTriangle(int size) {
		for(int i = 0; i < size;i++) {
			printWhiteSpaces(size - i);
			printingStars(i);
		}
	}

	public static void xmasTree(int height) {
		int extraStar = 1;
		for(int i = 0; i < height;i++) {
			printWhiteSpaces(height - i);
			printingStars(i + extraStar);
			extraStar++;
		}
		printWhiteSpaces(height - 1);
		printingStars(3);
		printWhiteSpaces(height - 1);
		printingStars(3);
	}
}