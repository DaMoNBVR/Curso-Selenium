import java.util.Scanner;

public class EjerciciosAlgoritmicosCapicua {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner, "Ingrese número a verificar si es su capicua");
        scanner.close();

        final var nInvertido = invertirNumero(n);
        final var esCapicua = esCapicua(n, nInvertido);

        System.out.printf("El número %d es capicua? %b%n", n , esCapicua);

    }

    static int invertirNumero(int n){

        var aux = n;
        var inverso = 0;

        while (aux !=0){

            final var residuo = aux % 10;
            inverso = inverso *10 + residuo;
            aux /= 10;

        }

        return inverso;

    }

    static boolean esCapicua (int n , int nInvertido){

        return n == nInvertido;

    }

}
