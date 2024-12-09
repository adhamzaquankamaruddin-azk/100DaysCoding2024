import java.util.Scanner;

public class Day99 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.println("KALKULATOR BILANGAN BULAT \n");
            
            System.out.print("Angka pertama : ");
            int angka1 = sc.nextInt();
            
            System.out.print("Angka kedua : ");
            int angka2 = sc.nextInt();
            
            System.out.println("Pilih operator : ");
            System.out.println("+ (Penjumlahan)");
            System.out.println("- (Pengurangan)");
            System.out.println("* (Perkalian)");
            System.out.println("/ (Pembagian)");
            System.out.println("% (Sisa Bagi)");
            
            System.out.print("Operator : ");
            String operator = sc.next();
            
            if (operator.equals ("+")) {
                System.out.println("\nHasil : \n" + angka1 + " + " + angka2 + " = "+(angka1 + angka2) + "\n");
            } else if (operator.equals ("-")) {
                System.out.println("\nHasil : \n" + angka1 + " - " + angka2 + " = " + (angka1 - angka2) + "\n");
            } else if (operator.equals ("*")) {
                System.out.println("\nHasil : \n" + angka1 + " * " + angka2 + " = " + (angka1 * angka2) + "\n");
            } else if (operator.equals ("/")) {
                if (angka2 == 0) {
                    System.out.println("\nTidak bisa di bagi " + angka2 + " \nCoba angka lain..!\n");
                } else {
                    System.out.println("\nHasil : \n" + angka1 + " / " + angka2 + " = " + (angka1 / angka2) + "\n");
                }
            } else if (operator.equals ("%")) {
                if (angka1 == 0 || angka2 == 0) {
                    System.out.println("\nAngka tidak valid untuk operator % (Sisa bagi). Coba angka lain! \n");
                } else {
                    System.out.println("\nHasil : \n" + angka1 + " % " + angka2 + " = " + (angka1 % angka2) + "\n");
                }
            } else {
                System.out.print("\nOperator tidak di ketahui \n");
                break;
            }
        }
    }
}
