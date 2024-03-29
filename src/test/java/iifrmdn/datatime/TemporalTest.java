package iifrmdn.datatime;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.time.*;
import java.time.temporal.*;
import java.util.ArrayList;
import java.util.List;

public class TemporalTest {

    @Test
    void create(){
        Temporal temporal1 = LocalTime.now();
        Temporal temporal2 = LocalDate.now();
        Temporal temporal3 = LocalDateTime.now();
        Temporal temporal4 = ZonedDateTime.now();
        Temporal temporal5 = Year.now();
        Temporal temporal6 = YearMonth.now();
        Temporal temporal7 = Instant.now();

        System.out.println(temporal1);
        System.out.println(temporal2);
        System.out.println(temporal3);
        System.out.println(temporal4);
        System.out.println(temporal5);
        System.out.println(temporal6);
        System.out.println(temporal7);
    }

    @Test
    void temporalAmount(){

        Temporal temporal1 = LocalDateTime.now();
        Temporal temporal2 = temporal1.plus(Duration.ofHours(1));
        Temporal temporal3 = temporal1.plus(Period.ofDays(3));

        System.out.println(temporal1);
        System.out.println(temporal2);
        System.out.println(temporal3);

    }

//    Menghitung durasi waktu
    @Test
    void temporalUnit(){

        long temporalUnit1 = ChronoUnit.HOURS.between(LocalTime.now(),LocalTime.now().plusHours(1));
        System.out.println(temporalUnit1);

    }

    @Test
    void temporalField(){

        Temporal temporal = LocalDateTime.now();

        System.out.println(temporal.get(ChronoField.YEAR));
        System.out.println(temporal.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(temporal.get(ChronoField.DAY_OF_MONTH));
        System.out.println(temporal.get(ChronoField.HOUR_OF_DAY));
        System.out.println(temporal.get(ChronoField.MINUTE_OF_HOUR));

    }


    @Test
    void temporalQuery(){

        Temporal temporal = LocalDateTime.now();

        List<Integer> integers = temporal.query(new TemporalQuery<List<Integer>>() {
        @Override
        public  List<Integer> queryFrom(TemporalAccessor temporalAccessor){
            ArrayList<Integer> list = new ArrayList<>();

            list.add(temporal.get(ChronoField.YEAR));
            list.add(temporal.get(ChronoField.MONTH_OF_YEAR));
            list.add(temporal.get(ChronoField.DAY_OF_MONTH));

            return list;
        }
        });

        System.out.println(integers);

    }

    @Test
    void temporalAdjuster(){

        Temporal temporal1  = LocalDate.now();
        Temporal temporal2 = temporal1.with(new TemporalAdjuster() {
            @Override
            public Temporal adjustInto(Temporal temporal) {
                return LocalDate.of(
                        temporal.get(ChronoField.YEAR),
                        temporal.get(ChronoField.MONTH_OF_YEAR),
                        temporal.get(ChronoField.DAY_OF_MONTH)
                );
            }
        });
        System.out.println(temporal2);

        // gk tau kenapa gk bisa
//        Temporal temporal3 = temporal1.with(TemporalAdjuster.first)

    }

}
