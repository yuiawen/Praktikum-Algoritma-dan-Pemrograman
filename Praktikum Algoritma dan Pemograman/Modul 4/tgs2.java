import java.util.*;
import java.lang.Math;

public class tgs2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double c, f, k, r;

        System.out.print("Masukkan Celcius = ");
        c = input.nextDouble();
        f = (double) 9 / 5 * c + 32;
        System.out.println("Fahrenheit = " + f);
        r = (double) 4 / 5 * c;
        System.out.println("Reamur = " + r);
    }
}
