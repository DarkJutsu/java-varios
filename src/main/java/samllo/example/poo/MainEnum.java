package samllo.example.poo;

import clases.EnumTest;
import utils.Day;

public class MainEnum {
    public static void main(String[] args) {
        EnumTest lunes = new EnumTest(Day.MONDAY);
        EnumTest sabado = new EnumTest(Day.SATURDAY);

        lunes.getDayState();
        sabado.getDayState();
    }
}
