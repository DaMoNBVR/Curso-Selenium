public class EjercicioVariables {
    public static void main(String[] args) {

        String profesion = "Abogado";
        int cantidadJuiciosGanados = 3;
        char letraFavorita = 'C';
        double peso = 80.52;
        boolean esColegiado = false;

        System.out.println("Hola, mi profesión es " + profesion + ", he ganado " + cantidadJuiciosGanados
        + " juicios");

        System.out.printf("Hola, mi profesión es %s, he ganado %d juicios", profesion, cantidadJuiciosGanados);

    }
}
