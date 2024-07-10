package clases;

import utils.Day;

public class EnumTest {
    Day day;

    public EnumTest(Day day) {
        this.day = day;
    }

    public void getDayState() {
        switch (day) {
            case MONDAY -> System.out.println("Monday is bad.");
            case FRIDAY -> System.out.println("Friday are better");
            case SATURDAY, SUNDAY -> System.out.println("Weekends are best");
            default -> System.out.println("Midweek days are so-so");
        }
    }
}
