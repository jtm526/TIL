
public class CastingEx2 {

	public static void main(String[] args) {
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);
		
		i = 300;
		b = (byte)i;
		System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b); // -128 <= byte <= 127
		
		b = -2;
		i = (int)b;
		System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);
		
		System.out.println("i = " + Integer.toBinaryString(i)); // 음수는 남는 부분 1로 채움
	}

}
