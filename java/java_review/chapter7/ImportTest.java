/* package문
 * import문
 * class 선언
 */

import java.text.SimpleDateFormat;
import java.util.Date;



public class ImportTest {

	public static void main(String[] args) {
        Date today = new Date();
        
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("Today's date is " + date.format(today));
        System.out.println("It's " + time.format(today) + " now");
        System.out.println(today);
	}

}
