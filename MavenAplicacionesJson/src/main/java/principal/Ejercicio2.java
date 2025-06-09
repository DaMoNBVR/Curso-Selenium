package principal;

import modelos.Joke;
import reader.JsonReader;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {

        final var arrayJokes = JsonReader.leerJokeArray();
        ordernarArray(arrayJokes);
        System.out.printf("El array ordenado es: %s%n", Arrays.toString(arrayJokes));

    }

    static void ordernarArray(Joke[] array){

        final var n = array.length;

        for (var i = 0; i < n; i++) {

            for (var j = 0; j < n - i -1; j++) {

                if (array[j].getId() > array[j + 1].getId()){

                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

        }

    }

}
