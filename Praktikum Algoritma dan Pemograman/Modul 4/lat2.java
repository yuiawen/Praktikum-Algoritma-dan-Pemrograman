import java.util.*;
import java.lang.Math;

public class lat2
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int nIM, u, no;
        String nama, teL, taL, e, j, a;

        System.out.println("Masukkan NIM = ");
        nIM = input.nextInt();
        System.out.println("Masukkan Nama = ");
        nama = input.next();
        System.out.println("Masukkan Tempat Lahir = ");
        teL = input.next();
        System.out.println("Masukkan Tanggal Lahir = ");
        taL = input.nextLine();
        System.out.println("Masukkan Usia = ");
        u = input.nextInt();
        System.out.println("Masukkan No Hp = ");
        no = input.nextInt();
        System.out.println("Masukkan E-mail = ");
        e = input.nextLine();
        System.out.println("Masukkan Jurusan = ");
        j = input.nextLine();
        System.out.println("Masukkan Alamat = ");
        a = input.nextLine();
        System.out.print("NIM = " + nIM);
        System.out.print("Nama = " + nama);
        System.out.print("Tempat Lahir = " + teL);
        System.out.print("Tanggal Lahir = " + taL);
        System.out.print("Usia = " + u);
        System.out.print("No Hp = " + no);
        System.out.print("E-mail = " + e);
        System.out.print("Jurusan = " + j);
        System.out.print("Alamat = " + a);
    }
}
