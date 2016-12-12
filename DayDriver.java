
public class DayDriver {

	public static void main(String[] args) {
		
		Day today = new Day("Wednesday");
		System.out.println(today);
		System.out.println(today.nextDay());
		System.out.println(today.previousDay());
		System.out.println(today.calculateDay(-10));

	}

}
