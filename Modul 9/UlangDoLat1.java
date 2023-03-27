public class UlangDoLat1 {
    public static void main(String args[]) {
        int c;
        double f;
        System.out.println("---------------------------");
        System.out.println("CELCIUS FAHREINHEIT");
        System.out.println("---------------------------");
        c = 20;
        do {
            f = 1.8 * c + 32;
            System.out.println("Celcius : " + c + " Fahreinhet : " + f);
            c++;
        } while (c <= 30);
        System.out.println("---------------------------");
    }
}