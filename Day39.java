import java.util.Scanner;
public class Day39 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int angka = sc.nextInt();
        System.out.println("============================");
        System.out.println("Angka yang di input : " + angka); //Misal: 13
        System.out.println("Operasi Penugasan Modulus :");
        System.out.println("Sebelum = " + angka);
        angka %= 2;
        System.out.println("Sesudah = " + angka);
    }
    
}
