
public class DeckTest {

	public static void main(String[] args) {
		Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println(c); // System.out.println(C.toString()); 과 같다. toString을 클래스에 정의하였더니 자동으로 호출
        // toString() 주석 처리할 시 주소값 반환 원래는 객체의 주소값이 저장되어있음
        
        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
	}

}

class Deck {
	final int CARD_NUM = 52;
	Card cardArr[] = new Card[CARD_NUM]; // 52장짜리 카드 덱 생성(Card객체배열을 포함)
	
	// Basic constructor
	Deck() { // Deck의 카드 초기화
		int i = 0;
		
		for (int k = Card.KIND_MAX; k > 0; k--) { // KIND_MAX, NUM_MAX는 클래스 변수로서 인스턴스 생성 없이 사용 가능
			for (int n = 0; n < Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(k, n+1); // 스페이드 1 부터 쭉 생성
			}
		}
	}
	
	// Deck 클래스의 메서드
	Card pick(int index) {
		return cardArr[index]; // 반환값의 자료형은 Card타입
	}
	
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM); // 0 ~ 51까지 숫자 중 랜덤하게 반환
		return pick(index);
	}
	
	// Shuffle cards randomly
	void shuffle() {
		for (int i = 0; i < cardArr.length; i++) {
			int randomNum = (int)(Math.random() * CARD_NUM);
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[randomNum];
			cardArr[randomNum] = temp;
		}
	}
	
}

class Card {
	static final int KIND_MAX = 4; // 카드 무늬 수
	static final int NUM_MAX = 13; // 무늬별 카드 수

	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	// Basic constructor
	Card() {
		this(SPADE, 1);
	}
	
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	// Create a method
	public String toString() {
		// 숫자, 무늬 둘 다 1부터 시작하므로 배열, 문자열에 0 추가
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK"; // 10 is equal to X
		return "kind: " + kinds[this.kind] + ", number: " + numbers.charAt(this.number); // String에서의 charAt 메서드
		
	}
	
}
