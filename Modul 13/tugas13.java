import java.util.Scanner;

public class tugas13 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int pil;
        System.out.println("Menu Pilihan ");
        System.out.println("1. Fibonacci");
        System.out.println("2. Faktorial");
        System.out.print(" Masukan Pilihan anda = ");
        pil = masuk.nextInt();
        if (pil == 1) {
            int a, x, y = 0;
            int z = 1;
            int n;
            System.out.print("masukkan jum deret : ");
            n = masuk.nextInt();
            for (a = 1; a <= n; a++) {
                x = y + z;
                z = y;
                y = x;
                System.out.print(x + " ");
            }
        } else if (pil == 2) {
            int hasil = 1, bil;
            System.out.println("Masukan faktorial = ");
            bil = masuk.nextInt();
            int i;
            for (i = 1; i <= bil; i++) {
                hasil = i * hasil;
            }
            System.out.println(hasil);
        } else
            System.out.print("Salah pilihan");
    }
}
