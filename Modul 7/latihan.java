import java.util.Scanner;

public class latihan {
    private static Scanner in = new Scanner(System.in);

    public static void main(String arg[]) {
        int pil;

        System.out.println("1. Mobil 2. Motor ");
        System.out.print("Masukkan Pilihan : ");
        pil = in.nextInt();

        if (pil == 1) {
            System.out.println("1. Jazz 2. Brio 3. Mobilio ");
            System.out.print("Masukkan Pilihan : ");
            pil = in.nextInt();
            if (pil == 1) {
                System.out.println("Harga Mobil Jazz : 170 jt");
            } else {
                if (pil == 2) {
                    System.out.println("Harga Mobil Brio : 120 jt");
                } else {
                    if (pil == 3) {
                        System.out.println("Harga Mobil Mobilio : 170 jt");
                    } else {
                        System.out.println("Salah Masukkan Pilihan");
                    }

                    if (pil == 2) {
                        System.out.println("1. Vario 2. Beat 3. Vixion ");
                        System.out.print("Masukkan Pilihan : ");
                        pil = in.nextInt();
                        if (pil == 1) {
                            System.out.println("Harga Motor Vario : 16 jt");
                        } else {
                            if (pil == 2) {
                                System.out.println("Harga Motor Beat : 14 jt");
                            } else {
                                if (pil == 3) {
                                    System.out.println("Harga Motor Vixion : 20 jt");
                                } else {
                                    System.out.println("Salah Masukkan Pilihan");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
