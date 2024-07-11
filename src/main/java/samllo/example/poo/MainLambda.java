package samllo.example.poo;

import interfaces.StringFunction;

import java.util.ArrayList;
import java.util.function.Consumer;


public class MainLambda {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("mango");
        frutas.add("sandia");
        frutas.add("fresa");
        frutas.add("pera");
        frutas.add("manzana");
        frutas.forEach((f) -> {
            System.out.println(f.isEmpty() ? "No hay fruta" : f);
        });

        System.out.println("\nUsando la interfas Consumer");
        Consumer<String> fConsum = (f) -> System.out.println(f.isEmpty() ? "No hay fruta" : f);
        frutas.forEach(fConsum);

        StringFunction exclaim = (s) -> s + '!';
        StringFunction ask = (s) -> s + '?';
        printFormatted("hola", exclaim);
        printFormatted("Hola", ask);

    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
