import java.util.Scanner;
public class Day52 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        
        System.out.println(angka % 2 == 0 ? "Genap" : "Ganjil");
    }
    
}
