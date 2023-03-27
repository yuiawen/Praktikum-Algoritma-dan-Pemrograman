import java.util.*;
import java.lang.Math;

public class Luas {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double r, luas;

        System.out.print("Masukkan Jari-Jari = ");
        r = input.nextDouble();
        luas = 3.14 * r * r;
        System.out.println("Luas Lingkaran = " + luas);
    }
}
