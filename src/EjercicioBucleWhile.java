import java.util.Scanner;

public class EjercicioBucleWhile {
    public static void main(String[] args) {

            final var scanner = new Scanner(System.in);

            final var a = ScannerManager.leerInt(scanner, "Ingrese el primer número");
            final var b = ScannerManager.leerInt(scanner, "Ingrese el segundo número");

            char opcion;

            do {

                imprimirMenu();
                opcion = ScannerManager.leerChar(scanner, "Ingrese una opción");

                if (opcion != 'F' && opcion != 'f'){

                    ejecutarOpcion(a,b,opcion);

                }

            }while (opcion != 'F' && opcion != 'f');

            scanner.close();

    }

    static void ejecutarOpcion(int a, int b, char opcion){

        final var resultado = switch (opcion){

            case 'A', 'a' -> calcularSuma(a,b);
            case 'B', 'b' -> calcularResta(a,b);
            case 'C', 'c' -> calcularMultiplicacion(a,b);
            case 'D', 'd' -> calcularDivision(a,b);
            case 'E', 'e' -> calcularResto(a,b);
            default -> -1;

        };

        if (resultado != -1){

            System.out.printf("El resultado entre los números %d & %d es %d%n", a,b,resultado);

        }
        else {

            System.out.println("Opcion incorrecta");

        }

    }

    static void imprimirMenu(){

        System.out.println("A/a: sumar");
        System.out.println("B/b: restar");
        System.out.println("C/c: multiplicar");
        System.out.println("D/d: dividir");
        System.out.println("E/e: resto");
        System.out.println("F/f: salir del programa");

    }

    static int calcularSuma(int a , int b){

        return a + b;

    }
    static int calcularResta(int a , int b){

        return a - b;

    }
    static int calcularMultiplicacion(int a , int b){

        return a * b;

    }
    static int calcularDivision(int a , int b){

        return a / b;

    }
    static int calcularResto(int a , int b){

        return a % b;

    }

}
