import java.util.Scanner;

public class Exercise5_13 {

	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // str -> char
			
			for (int j = 0; j < 10; j++) {
				int tmp = (int)(Math.random() * question.length);
				char c = question[0];
				question[0] = question[tmp];
				question[tmp] = c;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i + 1, new String(question));
			
			String answer = scanner.nextLine();
			
			if (words[i].equals(answer.trim()))
				System.out.println("맞았습니다.");
			else
				System.out.println("틀렸습니다.");
		}

	}

}