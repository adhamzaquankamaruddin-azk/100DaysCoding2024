public class Day72 {
    
    public static int faktor(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * faktor(n - 1);
        }
    }
    
    public static void main(String[] args) {
        int angka = 5;
        int hasil = faktor(angka);
        System.out.println("Faktorial dari " + angka + " adalah: " + hasil);
    }
}
