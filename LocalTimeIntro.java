/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 11-08-2020
 *  Time: 11:18 AM
 */
import javax.swing.JOptionPane;
import java.time.LocalTime;
public class LocalTimeIntro {
    public static void main(String[] args) {
        LocalTime localTime= LocalTime.now();
        JOptionPane.showMessageDialog(null,localTime,"Current Time",JOptionPane.PLAIN_MESSAGE);
        /*
        * This method will show the local time of your system in ---->
        *  hours:minutes:seconds:nanosecond
        * */

        //If you want to specify a particular time then you can do that as -->
        LocalTime specificTime = LocalTime.of(13,55,40);
        //The above time is 1:55:40 P.M!


        /*
        * There are also some constraints that we can use inside the LocalTime class.
        * Localtime.MIN; // 00:00
        * LocalTime.MAX; // 23:59:59:999999999
        * LocalTime.NOON; // 12:00
        * LocalTime.MIDNIGHT; // 00:00
        * */

        LocalTime noon=LocalTime.NOON;
        System.out.println(noon);

        //One can also fetch some particular attributes of the LocalTime objects like --->
        System.out.println("noon.getHour() = "+noon.getHour());
        System.out.println("noon.getMinute() = "+noon.getMinute());
        System.out.println("noon.getSecond() = "+noon.getSecond());
        System.out.println("noon.getNano() = "+noon.getNano());
    }
}
