import java.util.Random;

public class EjercicioMatematico {
    public static void main(String[] args) {

        final var min = 5;
        final var max = 100;
        final var random = new Random();

        final var velocidadInicial = (max - min) * random.nextDouble() + min;
        final var aceleracion = (max - min) * random.nextDouble() + min;
        final var tiempo = 5;

        final var velocidadFinal = velocidadInicial + aceleracion * tiempo;

        System.out.printf("Para una velocidad inicial de %.3f, una aceleración de %.3f" +
                " y un tiempo de %d, se tiene una velocidad final de %.3f"
                , velocidadInicial,aceleracion,tiempo,velocidadFinal );

    }
}