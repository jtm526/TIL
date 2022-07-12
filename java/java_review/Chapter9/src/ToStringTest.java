import java.util.*;

public class ToStringTest {

	public static void main(String[] args) {
		String str = new String("Korea");
		Date today = new Date();
		
		System.out.println(str);
		System.out.println(str.toString());// String class에 toString overriding 되어있음
		System.out.println(today);
		System.out.println(today.toString()); // Date class에 toString overriding 되어있음

	}

}
