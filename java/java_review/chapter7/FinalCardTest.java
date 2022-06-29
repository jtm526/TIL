
class Card2 {
	final int NUMBER; // 인스턴스의 변수의 경우 final 붙이고 생성자에서 초기화
	final String KIND;
	static int width = 100;
	static int height = 250;

	Card2(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}

	Card2() {
		this("HEART", 1);
	}

	
	 public String toString() { return KIND + " " + NUMBER; }
	

}

public class FinalCardTest {
	public static void main(String[] args) {
		Card2 card = new Card2("HEART", 10);
		
		System.out.println(card);
	}
}
