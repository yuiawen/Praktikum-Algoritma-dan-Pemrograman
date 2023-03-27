import java.util.Scanner;

public class lat13_1 {
	public static void main(String args[]) {
		Scanner masuk = new Scanner(System.in);
		int nilai, i;

		System.out.print("Masukan angka bulat = ");
		nilai = masuk.nextInt();
		if (nilai > 5) {
			for (i = nilai; i >= 1; i--) {
				{
					if (i == 5) {
						char choice;
						System.out.print("Apakah Perulangan Akan Dilanjutkan? (Y/N) : ");
						choice = masuk.next().charAt(0);
						if (choice == 'N') {
							break;
						} else {
							continue;
						}
					}
					System.out.println(i);
				}
			}
		} else {
			if (nilai < 5) {
				for (i = nilai; i <= 10; i++) {
					if (i == 4) {
						char choice;
						System.out.print("Apakah Perulangan Akan Dilanjutkan? (Y/N) : ");
						choice = masuk.next().charAt(0);
						if (choice == 'N') {
							break;
						} else {
							continue;
						}
					}
					System.out.println(i);
				}
			}
		}
	}
}
