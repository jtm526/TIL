
public class FlowEx22 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		for (int tmp: arr) {
			System.out.printf("%d ", tmp);
			sum += tmp;
		}
		System.out.println();
		System.out.printf("The sum of numbers in array is %d%n", sum);		
	}
}
