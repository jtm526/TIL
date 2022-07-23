// 클래스 객체를 얻는 방법


public class ClassEx1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		MyCard c = new MyCard("HEART", 3);
		try {
			MyCard c2 = MyCard.class.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Class cObj = c.getClass();
		System.out.println(c);
//		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}
}


final class MyCard {
	String kind;
	int num;
	
	MyCard() {
		this("SPADE", 1);
	}
	
	MyCard(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return kind + ": " + num;
	}
}