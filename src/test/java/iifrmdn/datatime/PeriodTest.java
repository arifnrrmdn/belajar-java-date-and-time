package iifrmdn.datatime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

    @Test
    void create(){
        Period period1 = Period.ofDays(10);
        Period period2 = Period.ofWeeks(10);
        Period period3 = Period.ofMonths(10);
        Period period4 = Period.ofYears(10);
        Period period5 = Period.of(10,10,10);
    }

    @Test
    void get(){
        Period period = Period.of(2222,22,22);

        int years = period.getYears();
        int monts = period.getMonths();
        int days = period.getDays();

        System.out.println(years);
        System.out.println(monts);
        System.out.println(days);
    }

    @Test
    void count(){
        Period period = Period.between(
                LocalDate.of(2022,10,10),
                LocalDate.of(2023,12,12)
        );

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
}
