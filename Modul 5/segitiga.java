import java.util.*;

public class segitiga {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, c;

        System.out.print("Masukkan bilangan A = ");
        a = input.nextInt();
        System.out.print("Masukkan bilangan B = ");
        b = input.nextInt();
        System.out.print("Masukkan bilangan C = ");
        c = input.nextInt();
        if (a == b && b != c && a != c || b == c && b != a && b != c || a == c && b != a && b != c) {
            System.out.println("Termasuk Segitiga = Segitiga sama kaki");
        } else {
            if (a == b || a == c || b == c) {
                System.out.println("Termasuk segitiga = Segitiga sama sisi");
            } else {
                System.out.println("Termasuk segitiga = Segitiga sembarang");
            }
        }
    }
}
