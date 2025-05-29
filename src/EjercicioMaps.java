import java.util.Map;
import java.util.Scanner;

public class EjercicioMaps {
    public static void main(String[] args) {

        final var mapUsuario = crearMap();
        final var scanner = new Scanner(System.in);

        int idLeido;
        System.out.println("Escriba un id del 1 al 6, presione -1 para salir");

        do {

            idLeido = ScannerManager.leerInt(scanner, "Ingrese el id deseado");
            if (idLeido != -1){

                mostrarUsuario(mapUsuario,idLeido);

            }

        } while (idLeido != -1);


    }

    static Map<Integer, String> crearMap(){

        return Map.of(

                1, "CocoX",
                2, "Socrates",
                3, "Calvario",
                4, "Kitty",
                5, "JavaJavaDu",
                6, "Rexxes"

        );

    }

    static void mostrarUsuario (Map<Integer, String> mapUsuario, int id){

        if (mapUsuario.containsKey(id)) {

            System.out.printf("Para el ID %d existe un username %s%n", id, mapUsuario.get(id));

        } else {

            System.out.printf("ID %d no encontrado en la base de datos%n", id);

        }

    }

}
