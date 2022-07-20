import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("This year: " + today.get(Calendar.YEAR));
		System.out.println("Month(0: Jan): " + today.get(Calendar.MONTH));
		System.out.println("WEEK_OF_YEAR: " + today.get(Calendar.WEEK_OF_YEAR));
		// 월은 0부터 시작
		System.out.println("WEEK_OF_MONTH: " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("이 달의 며칠: " + today.get(Calendar.DATE));
		System.out.println("이 달의 며칠: " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 며칠: " + today.get(Calendar.DAY_OF_YEAR));
		// 요일은 1부터 시작
		System.out.println("요일(1:sun): " + today.get(Calendar.DAY_OF_WEEK));
		
		// milliseconds
		System.out.println("1000분의 1초: " + today.get(Calendar.MILLISECOND));
		// 1000분의 1초를 시작으로 표시하기 위해 3600000으로 나눔(1시간 = 60 * 60초)
		System.out.println(today.get(Calendar.MILLISECOND) / (60 * 60 * 1000));
	}

}
