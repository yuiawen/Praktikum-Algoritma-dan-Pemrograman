import java.util.*;

public class lat1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double ipk;

        System.out.print("Masukkan IPK = ");
        ipk = input.nextDouble();
        System.out.print("Predikat Kelulusan = ");
        if (ipk >= 2.75 && ipk <= 2.99) {
            System.out.println("Memuaskan");
        } else {
            if (ipk >= 3.00 && ipk <= 3.50) {
                System.out.println("Sangat Memuaskan");
            } else {
                if (ipk >= 3.51 && ipk <= 4.00) {
                    System.out.println("Dengan Pujian");
				} else {
					System.out.println("Tidak Lulus");
                }
            }
        }
    }
}
