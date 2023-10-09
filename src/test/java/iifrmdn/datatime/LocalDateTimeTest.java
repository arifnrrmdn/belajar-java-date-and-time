package iifrmdn.datatime;

import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {

    @Test
    void create(){
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(1990,10,12,20,30,22);
        LocalDateTime localDateTime3 = LocalDateTime.parse("1990-10-12T20:30:22");

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void with(){
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.withYear(2000);
        LocalDateTime localDateTime3 = localDateTime1.withYear(2012).withMonth(12).withDayOfMonth(12).withHour(12).withMinute(12).withSecond(12);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void modify(){
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.plusYears(2);
        LocalDateTime localDateTime3 = localDateTime1.minusYears(3).plusMonths(1).plusMinutes(1);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void get(){
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
    }

    @Test
    void date(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //    Konversi dari localdatetime ke localdate
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);

        LocalDateTime result = localDate.atTime(20,27);
        System.out.println(result);
    }

    @Test
    void time(){

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

        LocalDateTime localDateTime1 = localTime.atDate(LocalDate.now());
        System.out.println(localDateTime1);

    }

}
