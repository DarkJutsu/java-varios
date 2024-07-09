package samllo.example.poo;

import clases.Busqueda;
import clases.OperacionesMath;
import interfaces.Calculadora;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculadora multi = OperacionesMath::multiplicar;
        System.out.println("Resultado: " + multi.realizarOperacion(4, 3));
        System.out.println("-----------------------------------------------");
        System.out.println("* Busqueda de posicion en un array de enteros ordenados, si se encuentar muestar el indice si no muestra -1 *");
        Busqueda busqueda = new Busqueda();
        int[] numData1 = {1, 2, 4, 6, 8};
        System.out.println("Posicion: " + busqueda.buscar(numData1, 7));

        int[] numData2 = {1, 2, 2, 6, 6, 6, 8};
        System.out.println("Rango: " + Arrays.toString(busqueda.buscarRango(numData2, 6)));

        int[] numData3 = {1, 3, 5, 7, 9};
        System.out.println("Insertado: " + busqueda.buscarInsert(numData3, 9));

    }
}
