import java.util.Scanner;

public class Day90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Modal Awal
        System.out.print("Masukkan Modal Awal: ");
        double modalAwal = sc.nextDouble();
        
        //Lama investasi, berapa tahun investasi nya
        System.out.print("Masukkan Lama Investasi: ");
        int lama = sc.nextInt();
        
        //Keuntungan investasi di setiap tahun nya
        //dengan modal yang telah di tentukan
        double keuntungan = 0;
        
        //Ini untuk menghitung berapa keuntungan yang
        //di dapat setiap tahun nya
        for (int i = 1; i <= lama; i++) {
            keuntungan = modalAwal * 0.05;
            modalAwal += keuntungan;
        }
        System.out.println(modalAwal);
    }
}
