import java.util.Arrays;

// 빈도 수 구하기

public class ArrayEx11 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);
		}
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;
		}
		// 빈도수 출력
		for (int i = 0; i < counter.length; i++) {
			System.out.printf("%d: %d%n", i, counter[i]);
		}
	}
}
