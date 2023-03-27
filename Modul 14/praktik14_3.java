import java.util.*;

public class praktik14_3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c, d, e, r;

        System.out.print("Masukan data ke-1 : ");
        a = input.nextInt();
        System.out.print("Masukan data ke-2 : ");
        b = input.nextInt();
        System.out.print("Masukan data ke-3 : ");
        c = input.nextInt();
        System.out.print("Masukan data ke-4 : ");
        d = input.nextInt();
        System.out.print("Masukan data ke-5 : ");
        e = input.nextInt();
        r = (int) ((double) (a + b + c + d + e) / 5);
        System.out.println("Nilai rata-Rata = " + r);
    }
}
