public class Perulanganbersarang1 {
	public static void main(String[] args) {
		int bilangan1;
		int bilangan2;
		bilangan1=1;
		while (bilangan1<=3) {
			bilangan2=1;
			while (bilangan2<=2) {
				System.out.println("[" + bilangan1 + "]" + "[" + bilangan2 + "]");
				bilangan2++;
			}
			bilangan1++;
		}
	}
}