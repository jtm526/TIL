
public class WrapperEx3 {
	public static void main(String[] args) {
		int i = 10;
		
		Integer intg = (Integer)i; // Integer intg = Integer.parseInt(i);
		Object obj = (Object)i; // Object obj = (Object)Integer.valueOf(i);
		
		Long lng = 100L;
		
		int i2 = intg + 10; // 참조형, 기본형 간의 연산.
		long l = intg + lng; // 참조형간의 연산
					
	}
}
