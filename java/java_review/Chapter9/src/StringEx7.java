
public class StringEx7 {

	public static void main(String[] args) {
		String fullName = "hello.java";
		
		// '.'의 위치 찾기
		int index = fullName.indexOf('.');
		
		// '.'위치까지 출력
		String fileName = fullName.substring(0, index);
		System.out.println(fileName);
		
		// '.' 다음 문자부터 문자열의 끝까지
		String ext = fullName.substring(index+1);
		
		System.out.println(ext);

	}

}
