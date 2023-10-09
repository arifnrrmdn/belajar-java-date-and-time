package iifrmdn.datatime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeTest {

    @Test
    void create(){

        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(10,10,10);
        LocalTime localTime3 = LocalTime.parse("10:10");

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void change() {

        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.withHour(12);
        LocalTime localTime3 = localTime1.withHour(12).withMinute(12).withSecond(12);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);

    }

    @Test
    void modify(){

        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.plusHours(10);
        LocalTime localTime3 = localTime1.minusHours(9).minusMinutes(47).minusSeconds(28);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);

    }

    @Test
    void get(){

        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);

        System.out.println(localTime1.getHour());
        System.out.println(localTime1.getMinute());
        System.out.println(localTime1.getSecond());
        System.out.println(localTime1.getNano());


    }

}
