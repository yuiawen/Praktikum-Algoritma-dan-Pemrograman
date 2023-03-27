public class latihan1 {
    public static void main(String args[]) {
        int bil;
        System.out.println("Kelipatan bilangan dari 10 sampai 50 : ");
        for (bil = 10; bil <= 50; bil++) {
            if (bil % 5 == 0)
                System.out.print(+bil + ", ");
        }
    }
}
