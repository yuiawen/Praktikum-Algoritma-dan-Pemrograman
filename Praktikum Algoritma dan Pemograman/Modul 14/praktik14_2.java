import java.util.Scanner;

public class praktik14_2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int r1, r2, r3, r;

        System.out.print("Nilai R1 : ");
        r1 = input.nextInt();
        System.out.print("Nilai R2 : ");
        r2 = input.nextInt();
        System.out.print("Nilai R3 : ");
        r3 = input.nextInt();
        r = (int) (1 / ((double) 1 / r1 + (double) 1 / r2 + (double) 1 / r3));
        System.out.println("Nilai R = " + r);
    }
}
