import java.util.Random;

public class EjercicioMetodos {
    public static void main(String[] args) {

        final var random = new Random();

        final var masa = RandomUtilities.generarRandomDouble(100,300, random);
        final var aceleracion = RandomUtilities.generarRandomDouble(3,5,random);

        final var fuerza = calcularFuerza(masa,aceleracion);

        imprimirResultado(masa,aceleracion,fuerza);

    }

    static double calcularFuerza(double masa, double aceleracion){

        return masa * aceleracion;

    }

    static void imprimirResultado(double masa, double aceleracion, double fuerza){

        System.out.printf("Para una masa de %.4f y aceleracion %.4f se tiene una fuerza de %.4f%n"
        , masa,aceleracion,fuerza);

    }

}
