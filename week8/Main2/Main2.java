public class Main2 {

	public static void main(String args[]) {
		NationalService nationalService = new CivilService();
		NationalService nationalService2 = new MilitaryService(100);

		System.out.println(nationalService.getDaysLeft());
		System.out.println(nationalService2.getDaysLeft());
	}
}