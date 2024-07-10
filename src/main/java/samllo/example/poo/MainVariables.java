package samllo.example.poo;

public class MainVariables {
    public static void main(String[] args) {
        byte x;
        int a = 123;
        double b = Math.PI;

        x = (byte) a;
        System.out.println("convertir int(" + a + ") a byte(" + x + ")");

        a = (int) b;
        System.out.println("convertir double(" + b + ") a int(" + a + ")");

        x = (byte) b;
        System.out.println("convertir double(" + b + ") a byte(" + x + ")");
    }
}
