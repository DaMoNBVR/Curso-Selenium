import java.util.Scanner;

public class EjercicioLecturaDatos {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);

        final var nombre = ScannerManager.leerString(scanner, "Ingrese su nombre");

        final var edad = ScannerManager.leerInt(scanner, "Ingrese su edad");

        final var estatura = ScannerManager.leerDouble(scanner, "Ingrese su estatura");

        scanner.close();

        imprimirResultado(nombre, edad, estatura);

    }

    static void imprimirResultado(String nombre,int edad, double estatura){

        System.out.printf("Hola %s, tu edad es de %d años y tu estatura es de %.2f metros"
                ,nombre, edad, estatura);

    }

}
