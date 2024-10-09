import java.util.Scanner;
public class Day38 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pengisian dan Perkalian
        System.out.print("Masukkan angka: ");
        int kali = sc.nextInt();
        System.out.println("Angka yang di masukkan = " + kali);
        kali *= 2;
        System.out.println("Perkalian: ");
        System.out.println("Angka setelah di kali = " + kali + "\n");
        
        //Pengisian dan Pembagian
        System.out.print("Masukkan angka: ");
        int bagi = sc.nextInt();
        System.out.println("Angka yang di masukkan = " + bagi);
        bagi /= 2;
        System.out.println("Pembagian: ");
        System.out.println("Angka setelah di bagi = " + bagi);
    }
    
}
