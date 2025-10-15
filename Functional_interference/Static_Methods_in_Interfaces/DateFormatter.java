import java.text.SimpleDateFormat;
import java.util.Date;
interface DateUtils {
    static String format(Date date) {
        return new SimpleDateFormat("dd-MM-yyyy").format(date);
    }
}
public class DateFormatter {
    public static void main(String[] args) {
        System.out.println(DateUtils.format(new Date()));
    }
}
