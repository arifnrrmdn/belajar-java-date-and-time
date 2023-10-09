package iifrmdn.datatime;

import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LegacyTest {

    @Test
    void fromLegacy(){

        Date date = new Date();
        System.out.println(date);
        Instant instant = date.toInstant();
        System.out.println(instant);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        Instant instant1 = calendar.toInstant();
        System.out.println(instant1);

        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone);
        ZoneId instant2 = timeZone.toZoneId();
        System.out.println(instant2);

    }

    @Test
    void toLeagacy(){

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        Date date = Date.from(zonedDateTime.toInstant());

        Calendar calendar = GregorianCalendar.from(zonedDateTime);

        ZoneId zoneId = ZoneId.systemDefault();
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);

    }

}
