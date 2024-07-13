package samllo.example.poo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class MainDate {
    public static void main(String[] args) {
        Date myDate = new Date();

        System.out.println(myDate);
        System.out.println("Como JAVA muestra en indices los meses (Enero) " + Calendar.JANUARY);
        System.out.println("\n");

        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        LocalDateTime fechaHora = LocalDateTime.now();
        ZonedDateTime zoneFH = ZonedDateTime.now();
        OffsetTime horaG_UTC = OffsetTime.now();
        OffsetDateTime fechaHoraG_UTC = OffsetDateTime.now();
        Clock ahora = Clock.systemUTC();
        Duration dura = Duration.between(Instant.parse("1997-06-15T00:01:01.01Z"), Instant.parse("2024-06-15T00:01:01.01Z"));

        System.out.println("Fecha actual: " + fechaActual);
        System.out.println("Hora actual(24 horas): " + horaActual);
        System.out.println("Fecha y Hora actual sin zona horaria: " + fechaHora);
        System.out.println("Fecha y Hora actual con zona horaria: " + zoneFH);
        System.out.println("Hora actual con una zona horaria(Greenwich/UTC): " + horaG_UTC);
        System.out.println("Fecha y Hora actual con zona horaria(Greenwich/UTC) sin ID de zona: " + fechaHoraG_UTC);
        System.out.println("Tiempo transcurrido de una fecha inico a una fecha fin(segundos): " + (((dura.getSeconds() / 60) / 60) / 24) / 365);
        System.out.println("Extraer solo fecha: " + fechaHora.toLocalDate());
        System.out.println("Extraer solo hora: " + fechaHora.toLocalTime());

        System.out.println("\n-- Operaciones con fechas y tiempo --");

        LocalDateTime fechaF = fechaHora.plusYears(1).plusDays(2).plusHours(3);
        System.out.println("Fecha tiempo futura: " + fechaF);
        System.out.println("Despues que la fecha: " + fechaF.isBefore(fechaHora));
        System.out.println("Antes que la fecha: " + fechaF.isAfter(fechaHora));

        LocalDate navidad = LocalDate.of(fechaActual.getYear(), Month.DECEMBER, 25);
        Period tiempoNavidad = Period.between(fechaActual, navidad);
        System.out.printf("\nPara navidad faltan %d años, %d meses, %d dias.", tiempoNavidad.getYears(), tiempoNavidad.getMonths(), tiempoNavidad.getDays());

    }
}
