package iifrmdn.datatime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class YearTest {

    @Test
    void create(){
        Year year1 = Year.now();
        Year year2 = Year.of(2050);
        Year year3 = Year.parse("2012");

        System.out.println(year1);
        System.out.println(year2);
        System.out.println(year3);

        YearMonth yearMonth1 = YearMonth.now();
        YearMonth yearMonth2 = YearMonth.of(2052,12);
        YearMonth yearMonth3 = YearMonth.parse("2022-12");

        System.out.println(yearMonth1);
        System.out.println(yearMonth2);
        System.out.println(yearMonth3);

        MonthDay monthDay1 = MonthDay.now();
        MonthDay monthDay2 = MonthDay.of(Month.JANUARY,10);
        MonthDay monthDay3 = MonthDay.parse("--12-10");

        System.out.println(monthDay1);
        System.out.println(monthDay2);
        System.out.println(monthDay3);
    }

//    Konversi year ke localdate
    @Test
    void name(){
        Year year = Year.now();

        LocalDate localDate = year.atMonth(Month.JANUARY).atDay(10);
        System.out.println(localDate);

        MonthDay monthDay = MonthDay.from(localDate);
        System.out.println(monthDay);

        }
// Mengambil
    @Test
    void get(){
        Year year = Year.now();
        YearMonth yearMonth = YearMonth.now();
        MonthDay monthDay = MonthDay.now();

        System.out.println(year.getValue());
        System.out.println(yearMonth.getYear());
        System.out.println(yearMonth.getMonthValue());
        System.out.println(monthDay.getMonth());
        System.out.println(monthDay.getMonthValue());
        System.out.println(monthDay.getDayOfMonth());
    }

}
