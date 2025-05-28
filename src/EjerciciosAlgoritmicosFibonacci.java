import java.util.Scanner;

public class EjerciciosAlgoritmicosFibonacci {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner, "Ingrese la cantidad de números serie de fibonacci");
        scanner.close();

        mostrarSerieFibonnaci(n);

    }

    static void mostrarSerieFibonnaci(int n){

        var anterior = 0;
        var actual = 1;

        System.out.printf("%d %d ", anterior,actual);

        for (var i = 0; i < n-2; i++) {

            final var temp = anterior + actual;
            anterior = actual;
            actual = temp;
            System.out.printf("%d ", actual);

        }

    }

}
