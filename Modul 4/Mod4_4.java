import java.util.Scanner;

public class Mod4_4 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int m;
        double cm, inci;
        System.out.print("Masukkan meter = ");
        m = masuk.nextInt();
        cm = m * 100;
        inci = m * 100 / 2.54;
        System.out.println("Hasil konversi cm = " + cm);
        System.out.println("Hasil konversi inci = " + inci);
    }
}