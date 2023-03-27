import java.util.Scanner;

public class tgs2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, n, j;

        System.out.print("Tentukan jumlah data : ");
        n = input.nextInt();
        i = 1;
        while (i <= n) {
            j = i * i;
            System.out.println(j);
            i = i + 1;
        }
    }
}
