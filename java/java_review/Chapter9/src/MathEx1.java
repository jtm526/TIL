import static java.lang.Math.*;

public class MathEx1 {
	public static void main(String[] args) {
		double val = 90.7552;
		System.out.println("round(" + val + ") = " + round(val));
		
		System.out.printf("rint(%3.1f) = %f%n", 1.5, rint(1.5));
		System.out.printf("rint(%2.1f) = %f%n", 2.5, rint(2.5));
	}
}
