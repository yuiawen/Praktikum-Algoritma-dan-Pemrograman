import java.util.Scanner;
	public class modul6_2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String kode;

		System.out.print("Masukkan kode jurusan = ");
		kode=in.next();
		switch(kode){
		case "TI":
		System.out.println("Teknik Informatika");
		break;
		case "TK":
		System.out.println("Teknik Komputer");
		break;
		case "MI":
		System.out.println("Manajemen Informatika");
		break;
		case "SI":
		System.out.println("Sistem Informasi");
		case "KA":
		System.out.println("Komputerisasi Akuntansi");
		break;
		default:
		System.out.println("Salah masukkan kode jurusan");


		}
	}
}
