import java.util.Scanner;

public class modul8_latihan {
    private static Scanner sc;

    public static void main(String[] args) {
        int minimum, maximum;
        sc = new Scanner(System.in);

        System.out.print(" Bilangan genap dimulai dari : ");
        minimum = sc.nextInt();

        System.out.print(" Bilangan genap diakhiri sampai : ");
        maximum = sc.nextInt();

        findEven(minimum, maximum);
    }

    public static void findEven(int minimum, int maximum) {
        int i;
        if (minimum % 2 != 0) {
            minimum++;
        }
        for (i = minimum; i <= maximum; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
    }
}