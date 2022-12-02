import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();

        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("H:m");

        date = formatter.parse(A + ":" + B);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, Integer.parseInt(C) );

        String solution = formatter.format(cal.getTime());

        String[] results = solution.split(":");

        System.out.printf("%1s %s",results[0],results[1]);

    }
}
