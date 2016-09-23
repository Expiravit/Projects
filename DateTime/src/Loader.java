import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by avalo on 16.08.2016.
 */
public class Loader {
    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        DateFormat dateFormat1 = new SimpleDateFormat("EEEE");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1993, Calendar.JANUARY, 27);
        Date date = calendar.getTime();

        for (int i = 0; i <= 23; i++) {
            date = calendar.getTime();
            System.out.println(i + " -- " + dateFormat.format(date) + " -- " + dateFormat1.format(date));
            calendar.add(Calendar.YEAR, 1);
        }


    }
}
