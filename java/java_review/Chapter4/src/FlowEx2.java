import java.util.Scanner;

public class FlowEx2 {
	public static void main(String[] args) {
		int input;
		System.out.println("Type a number");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.valueOf(tmp);
		
		if (input == 0) {
			System.out.println("It's zero!");
		} else {
			System.out.println("It's not a zero!");
		}
	}
}
