import java.util.*;

public class modul5__2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil;

		System.out.println("Masukkan Bilangan");
        bil = input.nextInt();
        if (bil == 0) {
            System.out.println("Bilangan 0");
        } else {
            System.out.println("Bilangan selain 0");
        }
    }
}