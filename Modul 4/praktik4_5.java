import java.util.Scanner;
public class praktik4_5
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int B, C, D, A;

        System.out.print("Masukkan B = ");
        B = input.nextInt();
        System.out.print("Masukkan C = ");
        C = input.nextInt();
        System.out.print("Masukkan D = ");
        D = input.nextInt();
        A = B + C * D;
        System.out.println("Hasil A = " + A);
    }
}
