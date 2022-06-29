// Getter and Setter

public class TimeTest {
    public static void main(String[] args) {
    	Time t = new Time(12, 35, 30);
    	System.out.println(t);
    	t.setHour(3);
    	System.out.println(t);
    }

}

class Time {
	private int hour, minute, second; // 외부에서 함부로 접근할 수 없도록 private 접근 제어자 사용
	
	Time() {
		this(0, 0, 0);
	}
	// Constructor
	// 함수를 이용하여 변수값 초기화
	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			return;
		}
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			return;
		}
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			return;
		}
		this.second = second;
	}
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}