public class Day95 {
    public static void main(String[] args) {
        
        System.out.println("Pola Segitiga Siku - Siku:");
        int n = 5; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\nPola Segitiga Siku - Siku Terbalik:");
        int z = 5;
        for (int i = z; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
