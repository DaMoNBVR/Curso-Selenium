import javax.management.relation.RelationNotFoundException;
import java.util.Arrays;
import java.util.Random;

public class EjercicioBubbleSort {
    public static void main(String[] args) {

        final var arrayAleatorio = RandomUtilities.generarRandomArrayInt(30,10,500, new Random());

        imprimirInformacion(arrayAleatorio);
        ordernarArray(arrayAleatorio);
        imprimirInformacion(arrayAleatorio);

    }

    static void ordernarArray(int[] array){

        final var n = array.length;

        for (var i = 0; i < n; i++) {

            for (var j = 0; j < n - i -1; j++) {

                if (array[j] > array[j + 1]){

                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

        }

    }

    static void imprimirInformacion(int[] array){

        System.out.printf("%s%n" , Arrays.toString(array));

    }

}
