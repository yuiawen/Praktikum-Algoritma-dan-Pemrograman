import java.util.Scanner;

public class tugas {
    private static Scanner in = new Scanner(System.in);

    public static void main(String arg[]) {
        String jenjang, jurusan;

        System.out.println("Jenjang D3/S1");
        System.out.print("Masukkan jenjang : ");
        jenjang = in.next();
        switch (jenjang) {
            case "D3":
                System.out.print("TK/KA/MI");
                System.out.print("Masukkan Jurusan : ");
                jurusan = in.next();
                switch (jurusan) {
                    case "TK":
                    case "KA":
                    case "MI":
                        System.out.println("Besaran SPA yang harus dibayar : Rp 10.000.000");
                        break;
                    default:
                        System.out.println("Salah masukkan jurusan");
                }
                break;
            case "S1":
                System.out.print("TI/SI");
                System.out.print("Masukkan Jurusan : ");
                jurusan = in.next();
                switch (jurusan) {
                    case "TI":
                        System.out.println("Besaran SPA yang harus dibayar : Rp 13.000.000");
                        break;
                    case "SI":
                        System.out.println("Besaran SPA yang harus dibayar : Rp 12.000.000");
                        break;
                    default:
                        System.out.println("Salah masukkan jurusan");
                }
                break;
            default:
                System.out.println("Salah masukkan jenjang");
        }
    }
}