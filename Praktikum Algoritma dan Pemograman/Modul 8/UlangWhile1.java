import java.util.Scanner;

public class UlangWhile1 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int bil;
        bil = 1;
        while (bil <= 5) {
            System.out.print(bil);
            bil = bil + 1;
        }
    }
}