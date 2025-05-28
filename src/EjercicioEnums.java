import java.util.Scanner;

public class EjercicioEnums {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);
        final var diaSemana = ScannerManager.leerString(scanner, "Ingrese el día de la semana" );
        scanner.close();

        imprimirResultado(diaSemana, calcularKCal(DiaSemana.valueOf(diaSemana)));

    }

    static int calcularKCal(DiaSemana diaSemana){

        return switch (diaSemana) {

            case Lunes -> 350;
            case Martes -> 420;
            case Miercoles -> 220;
            case Jueves -> 600;
            case Viernes -> 125;
            case Sabado -> 250;
            case Domingo -> 100;
            default -> -1;

        };

    }

    static void imprimirResultado(String diaSemana, int kCal){

        System.out.printf("Para el día %s se tiene que quemar %dkcal%n", diaSemana,kCal);

    }

    enum DiaSemana {

        Lunes,
        Martes,
        Miercoles,
        Jueves,
        Viernes,
        Sabado,
        Domingo

    }

}
