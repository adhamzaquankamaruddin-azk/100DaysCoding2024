import java.time.LocalTime;
import java.util.Scanner;

public class Day100 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        String pesan = null;
        
        LocalTime now = LocalTime.now();
        
        LocalTime pagi = LocalTime.of(11, 59); 
        LocalTime siang = LocalTime.of(12, 0);
        LocalTime sore = LocalTime.of(16, 59);
        
        if ( now.isBefore(siang)) {
            pesan = "Selamat pagi";
        } else if (now.isAfter(pagi) && now.isBefore(siang)) {
            pesan = "Selamat siang";
        } else if (now.isAfter(siang) && now.isBefore(sore)) {
            pesan = "Selamat malam";
        } 

        System.out.println("\n=======================================");
        System.out.println(pesan + ", " + nama);
        System.out.println("Program Anda Telah Selesai");
        System.out.println("=======================================");
    }
}
