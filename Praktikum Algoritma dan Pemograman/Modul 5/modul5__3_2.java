public class modul5__3_2 {
    public static void main(String[] args) {
        int usia;

        usia = 26;
        System.out.println("Usia = " + usia);
        if (usia <= 5) {
            System.out.println("Balita");
        } else {
            if (usia > 5 && usia <= 11) {
                System.out.println("Kanak-kanak");
            } else {
                if (usia > 11 && usia <= 25) {
                    System.out.println("Remaja");
                } else {
                    if (usia > 25) {
                        System.out.println("Dewasa");
                    }
                }
            }
        }
    }
}
