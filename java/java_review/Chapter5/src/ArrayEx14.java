
public class ArrayEx14 {
	public static void main(String[] args) {
		String src = "abcde";
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println(ch);
		}
		
		char[] charArr = src.toCharArray();
		System.out.println(charArr);
	}
}
