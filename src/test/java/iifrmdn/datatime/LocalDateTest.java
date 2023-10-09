package iifrmdn.datatime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * NOTE!
 * mengubah atau memanipulasi localdate akan menciptakan object baru
 */

public class LocalDateTest {

//    Membuat LocalDate
    @Test
    void create(){
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2003, Month.JANUARY,9);
        LocalDate localDate3 = LocalDate.of(2003,1,9);
        LocalDate localDate4 = LocalDate.parse("2003-01-09");

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
        System.out.println(localDate4);
    }

//    Mengubah LocalDate
    @Test
    void with(){
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.withYear(2003);
        LocalDate localDate3 = localDate2.withMonth(1);
        LocalDate localDate4 = localDate1.withYear(2004).withMonth(1).withDayOfMonth(19);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
        System.out.println(localDate4);
   }

   @Test
    void manipulation(){

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.plusYears(10);
        LocalDate localDate3 = localDate1.minusMonths(10);

       System.out.println(localDate1);
       System.out.println(localDate2);
       System.out.println(localDate3);

   }

//   Mengambil tanggal local date
    @Test
    void get(){

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());


    }



}
