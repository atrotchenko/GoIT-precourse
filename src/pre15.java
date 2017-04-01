/**
 * Created by victorpetrov on 01.04.17.
 */
public class pre15 {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;

        /*
        sleepIn(false, false);
        sleepIn(true, false);
        sleepIn(false, true);
        */

        System.out.println(sleepIn(true||true));

    }
}
