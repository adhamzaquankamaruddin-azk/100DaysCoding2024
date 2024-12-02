public class Day92 {
    public static void main(String[] args) {
        int tinggi = 5;
        
        for (int i = 1; i <= tinggi; i++) { 
            for (int j = 1; j <= 9; j++) { 
                if (j == i || j == (2 * tinggi - i)) { 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
