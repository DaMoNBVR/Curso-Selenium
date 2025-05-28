import java.util.Random;

public class EjercicioBucleFor {
    public static void main(String[] args) {

        final var n = RandomUtilities.generarRandomInt(5,20, new Random());
        mostrarNumeros1(n);
        mostrarNumeros2(n);
        mostrarNumeros3(n);

    }

    static void mostrarNumeros1(int n){

        for (var i = 1; i < n ; i++) {

            System.out.printf("%d ", i);

        }

        System.out.println();

    }
    static void mostrarNumeros2(int n){

        for (var i = 1; i <= n ; i++) {

            System.out.printf("%d ", i);

        }

        System.out.println();

    }
    static void mostrarNumeros3(int n){

        for (var i = n; i > 0 ; i--) {

            System.out.printf("%d ", i);

        }

        System.out.println();

    }

}
