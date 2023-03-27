import java.util.*;

public class coba {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int b1, b2, b3, terbesar, terkecil;

        System.out.print("Masukan Bilangan 1 = ");
        b1 = input.nextInt();
        System.out.print("Masukan Bilangan 2 = ");
        b2 = input.nextInt();
        System.out.print("Masukan Bilangan 3 = ");
        b3 = input.nextInt();
        if (b1 > b2 && b1 > b3) {
            terbesar = b1;
            if (b1 < b2 && b1 < b3) {
                terkecil = b1;
            } else {
                if (b2 < b3) {
                    terkecil = b2;
                } else {
                    terkecil = b3;
                }
            }
            System.out.println("Bilangan Terbesar = " + terbesar);
            System.out.println("Bilangan Terkecil = " + terkecil);
        } else {
            if (b2 > b3) {
                terbesar = b2;
                if (b1 < b2 && b1 < b3) {
                    terkecil = b1;
                } else {
                    if (b2 < b3) {
                        terkecil = b2;
                    } else {
                        terkecil = b3;
                    }
                }
                System.out.println("Bilangan Terbesar = " + terbesar);
                System.out.println("Bilangan Terkecil = " + terkecil);
            } else {
                terbesar = b3;
                if (b1 < b2 && b1 < b3) {
                    terkecil = b1;
                } else {
                    if (b2 < b3) {
                        terkecil = b2;
                    } else {
                        terkecil = b3;
                    }
                }
                System.out.println("Bilangan Terbesar = " + terbesar);
                System.out.println("Bilangan Terkecil = " + terkecil);
            }
        }
    }
}
