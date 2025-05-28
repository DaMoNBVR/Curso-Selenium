import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjercicioArrays {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);
        final var tamArray = ScannerManager.leerInt(scanner, "Ingrese el tamaño del array");
        final var min = ScannerManager.leerInt(scanner, "Ingrese el mínimo");
        final var max = ScannerManager.leerInt(scanner, "Ingrese el máximo");
        final var escalar = ScannerManager.leerInt(scanner, "Ingrese el escalar");

        scanner.close();

        final var arrayOriginal = RandomUtilities.generarRandomArrayInt(tamArray, min, max, new Random());
        final var arrayNuevo = calcularProductoEscalar(arrayOriginal, escalar);

        imprimirInformacion(arrayOriginal, arrayNuevo);

    }

    static int[] calcularProductoEscalar(int[] array, int escalar){

        final var n = array.length;
        final var nuevoArray = new int[n];

        for (var i = 0; i < n; i++) {

            nuevoArray[i] = array [i] * escalar;

        }

        return nuevoArray;

    }

    static void imprimirInformacion (int[] arrayOriginal, int[] arrayNuevo){

        System.out.printf("El array original es: %s%n", Arrays.toString(arrayOriginal));
        System.out.printf("El array escalado es: %s%n", Arrays.toString(arrayNuevo));

    }

}
