import java.util.Scanner;
 public class coba2{
 	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int start, max;
	System.out.print("Masukkan nilai awal: ");
	start=sc.nextInt();
	System.out.print("Masukkan nilai akhir: ");
	max=sc.nextInt();
	System.out.println("Data bilangan genap antara " +start+ " sampai " +max+ " : ");
	while(start<=max){
    if(start %2 == 1){
        start++;
        System.out.print(start+", ");
    	}else
        	System.out.print(start+", ");
        	start=start+2;
		}
	}
}


