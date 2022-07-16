import java.util.Arrays;

// Bubble sort

public class ArrayEx10 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);
		}
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < numArr.length-1; i++) {
			boolean changed = false; // 자리바꿈 확인
			
			for (int j = 0; j < numArr.length-1-i; j++) {
				if (numArr[j] > numArr[j+1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					changed = true;
				}
			}
			
			// 자리바꿈 없을 시 정렬이 되었으므로 반복문 벗어남.
			if (!changed) {
				break;
			}
		}
		System.out.println(Arrays.toString(numArr));
	}
}
