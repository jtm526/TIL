// String array

public class ArrayEx12 {
	public static void main(String[] args) {
		String[] names = {"Moon", "Lee"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.printf("names[%d]: %s%n", i, names[i]);
		}
		
		for (String name: names) {
			System.out.println(name);
		}
	}
}
