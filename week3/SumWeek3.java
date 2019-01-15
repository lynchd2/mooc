public class SumWeek3 {

	public static void main(String[] args) {
		sum(3,4,5,6);
		average(sum(3,4,5,6));

	}

	public static int sum(int one, int two, int three, int four) {
		int sum = one + two + three + four;
		System.out.println("Your sum is: " + sum);
		return sum;
	}

	public static void average(int sum) {
		double average = sum / 4.0;
		System.out.println(average);
	}
}