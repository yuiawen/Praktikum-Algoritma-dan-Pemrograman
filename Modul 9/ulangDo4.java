import java.util.Scanner;

public class ulangDo4 {
    public static void main(String args[]) {
        int x, max;
        Scanner in = new Scanner(System.in);
        System.out.print("Banyak tulisan : ");
        max = in.nextInt();
        x = 0;
        do {
            System.out.println("STMIK AKAKOM");
            x++;
        } while (x <= max);
    }
}