package Introduction_to_Java.firstProgram;

public class Switch {

	public static void main(String[] args) {
		
		int month = 2;
		switch(month) {
		case 1: {
			System.out.println("Jan");
			break;
		}
		
		case 2: {
			System.out.println("Feb");
			break;
		}
		
		case 3: {
			System.out.println("March");
			break;
		}
		
		case 4: {
			System.out.println("April");
			break;
		}
		
		case 5: {
			System.out.println("May");
			break;
		}
		
		case 6: {
			System.out.println("June");
			break;
		}
		
		case 7: {
			System.out.println("July");
			break;
		}
		
		}
		int day = 2;
		switch(day) {
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		case 7 -> System.out.println("Sunday");

		}
		
	}

}
