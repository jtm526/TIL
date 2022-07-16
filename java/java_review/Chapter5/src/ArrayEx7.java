import java.util.Arrays;

// Shuffle array
public class ArrayEx7 {
	public static void main(String[] args) {
		int [] numArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
		}
		System.out.println(Arrays.toString(numArr));
		
		// Shuffle any index arr with arr[0]
		for (int i = 0; i < 100; i++) {
			int n = (int)(Math.random() * 10); // Get any number btw 0 to 9
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println(Arrays.toString(numArr));
	}
}
