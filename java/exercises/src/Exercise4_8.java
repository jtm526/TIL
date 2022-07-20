
public class Exercise4_8 {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if (((10-2*i)/4.0) == 0) {
					System.out.printf("x=%d, y=%d%n", i, j);
				}
			}
		}
	}
}
