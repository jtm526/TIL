import java.util.Arrays;

public class Exercise5_9 {
	public static void main(String[] args) {
		char[][] star = {
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', ' ', ' ', ' '},
				{'*', '*', '*', '*', '*'},
				{'*', '*', '*', '*', '*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		// 시계방향으로 90도 회전
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				// result의 새로운 좌표
				int x = j;
				int y = star.length - 1 - i;
				
				result[x][y] = star[i][j];
			}
		}
		
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%c", result[i][j]);
			}
			System.out.println();
		}
	}
}
