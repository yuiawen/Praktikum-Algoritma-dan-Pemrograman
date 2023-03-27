import java.util.Scanner;

public class tugas9_1 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int i = 1;
        float n, jum = 0, x = 0, rata;
        System.out.println("Banyak data : ");
        n = masuk.nextFloat();
        do {
            System.out.println("data ke- " + i);
            x = masuk.nextFloat();
            jum += x;
            i++;
        } while (i <= n);
        System.out.println("Jumlah = " + jum);
        System.out.println("Rata-rata = " + (jum / n));
    }
}
