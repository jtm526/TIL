import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type a number");
		String input = scanner.nextLine();
		int number = Integer.valueOf(input);
		
		System.out.printf("You typed %d%n", number);
	}

}
