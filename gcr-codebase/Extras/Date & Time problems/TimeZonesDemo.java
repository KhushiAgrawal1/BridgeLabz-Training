// Program Name : TimeZonesDemo
// Description  : Displays current time in different time zones using ZonedDateTime

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZonesDemo
{
    public static void main(String[] args)
    {
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current Time in GMT : " + gmt);
        System.out.println("Current Time in IST : " + ist);
        System.out.println("Current Time in PST : " + pst);
    }
}
