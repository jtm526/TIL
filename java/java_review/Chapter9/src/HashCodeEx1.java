
public class HashCodeEx1 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// String 클래스는 문자열 내용이 같으면 동일 해시코드 반환
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// identityHashCode()는 객체 주솟값으로 해시값 반환
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

	}

}
