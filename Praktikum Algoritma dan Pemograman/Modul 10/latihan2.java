import java.util.Scanner;

public class latihan2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, min, max;
        System.out.print("Nilai awal : ");
        min = input.nextInt();
        System.out.print("Nilai akhir : ");
        max = input.nextInt();
        System.out.println("Kelipatan 5 dari " + min + " sampai " + max + ":");
        for (x = min; x <= max; x++) {
            if (x % 5 == 0) {
                System.out.println(x);
            }
        }
    }
}
