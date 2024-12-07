import java.util.Scanner;
public class Day97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan batas angka: ");
        int n = sc.nextInt();

        System.out.println("Bilangan prima dari 1 hingga " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean prima = true;
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false; 
                    break;
                }
            }
            
            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
}
