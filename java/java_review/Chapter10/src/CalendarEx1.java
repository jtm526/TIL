import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("This year: " + today.get(Calendar.YEAR));
		System.out.println("Month(0: Jan): " + today.get(Calendar.MONTH));
		System.out.println("WEEK_OF_YEAR: " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("WEEK_OF_MONTH: " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("이 달의 며칠: " + today.get(Calendar.DATE));
		System.out.println("이 달의 며칠: " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 며칠: " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(0:sun): " + today.get(Calendar.DAY_OF_WEEK));
	}

}
