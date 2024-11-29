import java.util.Scanner;
public class Day89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa(Maksimum 10): ");
        int batas = sc.nextInt();
        
        String[] nama = new String[batas];
        
        if(batas <= 10) {
            for(int i = 0; i < batas; i++) {
                System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
                nama[i] = sc.next();
            }
            System.out.println("\nDaftar nama Siswa:");
            for(int i = 0; i < batas; i++) {
                System.out.println((i + 1) + ". " + nama[i]);
            }
        } else {
            System.out.println("Batas siswa melebihi maksimum!");
        }
    }
}
