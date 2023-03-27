import java.util.Scanner;

public class tugas2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, min, max, jum;
        System.out.print("Nilai awal : ");
        min = input.nextInt();
        System.out.print("Nilai akhir : ");
        max = input.nextInt();
        jum = 0;
        System.out.println("Kelipatan 5 dari " + min + " sampai " + max + ":");
        for (x = min; x <= max; x++) {
            if (x % 5 == 0) {
                System.out.println(x);
                jum = jum + x;
            }
        }
        System.out.println("Jumlah data : " + jum);
    }
}
