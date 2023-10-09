package iifrmdn.datatime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest {

    @Test
    void createParsing(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2020 10 25", formatter);
        System.out.println(localDate);
    }

    @Test
    void createFormat(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate localDate = LocalDate.parse("2020 10 25", formatter);

        String format = localDate.format(formatter);
        System.out.println(localDate);
    }

    @Test
    void standardFormat(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate localDate = LocalDate.parse("2020 10 25", formatter);

        String format = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate);
    }

    @Test
    void i18n(){

        Locale locale = new Locale("in","ID");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

        LocalDate localDate = LocalDate.of(2023, 1, 1);
        String format = localDate.format(formatter);

        System.out.println(format);


    }
}
