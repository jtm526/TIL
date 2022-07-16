// Get max and min

public class ArrayEx6 {
	public static void main(String[] args) {
		int[] score = new int[] {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) { // max가 아닐 시 min이 될 수도 있으므로 else if 사용
				min = score[i];
			}
			
//			if (score[i] < min) {
//				min = score[i];
//			}
			
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
