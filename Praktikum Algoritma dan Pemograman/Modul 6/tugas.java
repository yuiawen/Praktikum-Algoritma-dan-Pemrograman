import java.util.Scanner;

public class tugas {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pil, lp, p, l;
        double ll, r;

        System.out.println("1. Luas Persegi Panjang 2. Luas Lingkaran");
        System.out.print("Masukkan Pilihan : ");
        pil = input.nextInt();
        switch (pil) {
            case 1:
                System.out.println("Menghitung Luas Persegi Panjang");
                System.out.print("Masukkan panjang : ");
                p = input.nextInt();
                System.out.print("Masukkan lebar : ");
                l = input.nextInt();
                lp = p * l;
                System.out.println("Luas Persegi Panjang : " + lp);
                break;
            case 2:
                System.out.println("Menghitung Luas Lingkaran");
                System.out.print("Masukkan Jari-Jari : ");
                r = input.nextDouble();
                ll = 3.14 * r * r;
                System.out.println("Luas Lingkaran : " + ll);
                break;

            default:
                System.out.println("Salah Memasukkan Pilihan");
                break;
        }
    }
}