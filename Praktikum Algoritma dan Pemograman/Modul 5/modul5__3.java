public class modul5__3 {
    public static void main(String[] args) {
        System.out.println("Usia antara 0-25");
        int usia;

        usia = 20;
        System.out.println("Usia = " + usia);
        if (usia <= 5) {
            System.out.println("Balita");
        } else {
            if (usia > 5 && usia <= 11) {
                System.out.println("Kanak-kanak");
            } else {
                System.out.println("Remaja");
            }
        }
    }
}
