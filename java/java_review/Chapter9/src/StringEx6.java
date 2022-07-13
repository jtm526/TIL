
public class StringEx6 {

	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); // int to String
		
		double dval = 10.0;
		String strVal2 = String.valueOf(dval);
		
		double sum1 = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println("sum1: " + sum1);
		System.out.println("sum2: " + sum2);

	}

}
