package samllo.example.poo;

public class MainCondicional {
    public static void main(String[] args) {
        int n1 = (int) (1 + (Math.random() * 10)), n2 = (int) (1 + (Math.random() * 10));
        String resut = (n1 > n2) ? "El primer numero(" + n1 + ") es mayor" : "El segundo numero(" + n2 + ") es mayor";
        System.out.println(resut);
    }
}
