public class Day96 {
    public static void main(String[] args) {
        int a = 5;
        
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= 9; j++) {
                if (j == i || j == (10 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        int n = 5;
        
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= 9; j++) { 
                if (j == i || j == (2 * n - i)) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
