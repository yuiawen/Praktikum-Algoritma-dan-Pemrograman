import java.util.*;
import java.lang.Math;

public class tgs1_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int gp;
        double tg, tk, tl;

        System.out.print("Masukkan Gaji Pokok = ");
        gp = input.nextInt();
        tk = 0.2 * gp;
        tl = 0.1 * tk;
        tg = gp + tk + tl;
        System.out.println("Tunjangan Kinerja = " + tk);
        System.out.println("Tunjangan Lain = " + tl);
        System.out.println("Total Gaji = " + tg);
    }
}
