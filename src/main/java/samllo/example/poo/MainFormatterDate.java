package samllo.example.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainFormatterDate {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();

        DateTimeFormatter formatUS = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.US);
        String localizedDate = fecha.format(formatUS);

        System.out.println(localizedDate);
    }
}
