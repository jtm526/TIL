
public class Exercise4_4 {

	public static void main(String[] args) {
		int sum = 0, i = 1;
		
		while (true) {
			sum += i;
			if (sum >= 100)
				break;
			if (i > 0) {
				i = (i+1) * (-1);
			} else {
				i = (i-1) * (-1);
			}
		}
		System.out.println(i);

	}

}
