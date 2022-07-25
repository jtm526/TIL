import java.util.Scanner;

public class FlowEx6 {
	public static void main(String[] args) {
		System.out.println("Type today's month");
		
		Scanner scanner = new Scanner(System.in);
		int month = Integer.valueOf(scanner.nextLine());
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("It's spring");
			break;
		case 6: case 7: case 8: 
			System.out.println("It's summer");
			break;
		case 9: case 10: case 11:
			System.out.println("It's autumn");
			break;
		case 12: case 1: case 2:
			System.out.println("It's winter");
			break;
		}
		
		
	}
}
