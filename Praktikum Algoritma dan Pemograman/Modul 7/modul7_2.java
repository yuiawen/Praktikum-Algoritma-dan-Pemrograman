import java.util.Scanner;

public class modul7_2 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String arg[]) {
		int nilai;

        System.out.print("Masukkan angka bulat (0-100)");
        nilai = in.nextInt();
        if (nilai >= 60) {
            if (nilai >= 80)
                System.out.println("Nilaimu bagus sekali");
            else
                System.out.println("Nilaimu bagus");
        } else {
            if (nilai < 60)
                if (nilai >= 30)
                    System.out.println("Nilaimu kurang");
                else
                    System.out.println("Nilaimu jelek");
        }
    }
}