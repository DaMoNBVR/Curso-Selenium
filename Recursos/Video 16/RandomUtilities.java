import java.util.Random;

public class RandomUtilities {
    static int generarRandomInt(int max, int min, Random random) {
        return random.nextInt(max - min + 1) + min;
    }

    static double generarRandomDouble(double max, double min, Random random) {
        return (max - min) * random.nextDouble() + min;
    }
}
