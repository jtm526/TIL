// Copy array using System.arraycopy()

public class ArrayEx4 {
	public static void main(String[] args) {
		char[] c1 = {'a', 'b', 'c', 'd'};
		char[] c2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8'};
		
		// char배열은 println으로도 배열값 출력 가능
		System.out.println(c1);
		System.out.println(c2);
		
		char[] result = new char[c1.length + c2.length];
		System.arraycopy(c1, 0, result, 0, c1.length); // Copy c1 to result
		System.arraycopy(c2, 0, result, c1.length, c2.length);
		System.out.println(result);
	}
}
