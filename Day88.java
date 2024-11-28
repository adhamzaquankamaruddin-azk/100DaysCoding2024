import java.util.Scanner;
public class Day88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Status (PNS / Non-PNS): ");
        String status = sc.next();
        
        System.out.print("Masukkan Gaji Pokok: ");
        int gajiPokok = sc.nextInt();
        
        if(status.equalsIgnoreCase("pns")) {
            if(gajiPokok >= 2000000 && gajiPokok <= 5000000) {
                System.out.println("Gaji Bersih: " + (gajiPokok - (gajiPokok * 10 / 100)));
            } else if(gajiPokok >= 5000000) {
                System.out.println("Gaji Bersih: " + (gajiPokok - (gajiPokok * 12 / 100)));
            } else {
                System.out.println("Gaji Bersih: " + (gajiPokok - (gajiPokok * 5 / 100)));
            }
        } else if(status.equalsIgnoreCase("non-pns")) {
            if(gajiPokok >= 2000000 && gajiPokok <= 5000000) {
                System.out.println("Gaji Bersih: " + (gajiPokok - (gajiPokok * 5 / 100)));
            } else if(gajiPokok >= 5000000) {
                System.out.println("Gaji Bersih: " + (gajiPokok - (gajiPokok * 7 / 100)));
            } else {
                System.out.println("Gaji Bersih: " + gajiPokok);
            }
        } else {
            System.out.println("Status Pegawai tidak valid. Masukkan status pegawai sesuai dengan ketentuan yang ada!");
        }
    }
}
