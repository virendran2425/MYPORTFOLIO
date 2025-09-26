package java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class LocalDateConcept {
    public static void main(String[] args) throws InterruptedException {

        String date = "25/09/2025";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d = LocalDate.parse(date,dateTimeFormatter);
        System.out.println(d);

        /*LocalDate now = LocalDate.parse("2025-08-23");
        System.out.println(now);*/

        /*LocalDate then = LocalDate.of(1988, 2, 25);
            Period period = Period.between(now, then);
        System.out.println(period);*/

        //System.out.println(Start);
        //Thread.sleep(5000);
        //LocalTime End = LocalTime.now();
        //Duration du = Duration.between(Start, End);
        //System.out.println(du);
       /* String s = "";
        ZonedDateTime z = ZonedDateTime.now();
        System.out.println(z);

        Set <String> z1 = ZoneId.getAvailableZoneIds();
        z1.stream().forEach(s1 -> System.out.println(s1));
        System.out.println(ZoneId.getAvailableZoneIds());

        System.out.println(z.getHour());
        System.out.println(z.getMinute());
        System.out.println(z.getNano());*/

        /*LocalTime l = LocalTime.now();
        System.out.println(l);
        System.out.println(l.getHour());
        System.out.println(l.getMinute());
        System.out.println(l.getNano())*/

        /*int year = l.getYear();
        if (year>0)
            s = "year-"+ year;
        System.out.println(s);
        System.out.println(l.getDayOfMonth());
        System.out.println(LocalDate.now());
        LocalDate l1 =LocalDate.of(2001,3,22);
        System.out.println(l1);*/
    }
}
