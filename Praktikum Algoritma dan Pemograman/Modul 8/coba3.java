import java.util.Scanner;
 public class coba3{
	public static void main(String args[])
	{
   	Scanner masuk = new Scanner(System.in);
   	 	System.out.print("Masukkan nilai awal : ");
   	 	int x = masuk.nextInt();
   	 	System.out.print("Masukkan nilai akhir : ");
   	 	int y = masuk.nextInt();
   	 	System.out.print("Data bilangan genap antara " +x+ " sampai " +y+ " : ");
   	 	while (x <= y) {
		 if (x % 2 == 0)
		 System.out.print(+x+", ");
		 x++;
		}
	}
}
