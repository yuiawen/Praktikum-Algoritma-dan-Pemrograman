import java.util.Scanner;

public class modul7_3b {
    private static Scanner in = new Scanner(System.in);

    public static void main(String arg[]) {
        String pil, jenis;
        int luas, kel, sisi;
        double jari, luasl, kell;
        System.out.println("Hitung persegi/lingkaran");
        System.out.print("Masukkan pilihan : ");
        pil = in.next();
        switch (pil) {
            case "persegi":
                System.out.print("Masukkan sisi : ");
                sisi = in.nextInt();
                System.out.print("luas/keliling : ");
                jenis = in.next();
                switch (jenis) {
                    case "luas":
                        luas = sisi * sisi;
                        System.out.println("Luas persegi : " + luas);
                        break;
                    case "keliling":
                        kel = 4 * sisi;
                        System.out.println("Keliling persegi: " + kel);
                        break;
                    default:
                        System.out.println("Salah masukkan jenis");
                }
            case "lingkaran":
                System.out.print("Masukkan jari-jari : ");
                jari = in.nextDouble();
                System.out.print("luas/keliling : ");
                jenis = in.next();
                switch (jenis) {
                    case "luas":
                        luasl = 3.14 * jari * jari;
                        System.out.println("Luas lingkaran : " + luasl);
                        break;
                    case "keliling":
                        kell = 2 * 3.14 * jari;
                        System.out.println("Keliling lingkaran : " + kell);
                        break;
                    default:
                        System.out.println("Salah masukkan jenis");
                }
                break;
            default:
                System.out.println("Salah masukkan pilihan");
        }
    }
}