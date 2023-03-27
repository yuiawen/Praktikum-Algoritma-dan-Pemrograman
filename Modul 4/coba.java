import java.util.scanner;

public class coba {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int B, C, D, A;

        System.out.println("Masukkan B = ");
        B = input.nextInt();
        System.out.println("Masukkan C = ");
        C = input.nextInt();
        System.out.println("Masukkan D = ");
        D = input.nextInt();
        A = B + C * D;
        System.out.println("Hasil A = " + A);
    }
}
