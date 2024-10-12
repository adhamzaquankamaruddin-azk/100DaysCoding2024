package AdhamZaquanKamaruddin;

import java.math.BigInteger;
import java.util.Scanner;
public class Day41 {
    
    public static void main(String[] args) {
        // SOAL 1
        System.out.println("Soal #1");
        
        int asoal1 = 150;
        String bsoal1 = Integer.toString(asoal1);
        System.out.println("Hasil konversi integer ke String = " + bsoal1);
        int csoal1 = Integer.valueOf(bsoal1);
        System.out.println("Hasil konversi String kembali ke integer = " + csoal1);
        System.out.println(); //Soutln kosong, cuma untuk memberi jarak soal satu dengan soal berikutnya
        
        // SOAL 2
        System.out.println("Soal #2");
        
        int asoal2 = 75;
        System.out.println("int = " + asoal2);
        double bsoal2 = asoal2;
        System.out.println("Nilai setelah typecasting ke double = " + bsoal2);
        System.out.println(); //Soutln kosong, cuma untuk memberi jarak soal satu dengan soal berikutnya
        
        // SOAL 3
        System.out.println("Soal #3");
        
        BigInteger asoal3 = new BigInteger("98765432109876543210");
        BigInteger bsoal3 = new BigInteger("12345678901234567890");
        System.out.println("Penjumlahan BigInteger = " + (asoal3.add(bsoal3)));
        System.out.println("Perkalian BigInteger = " + (asoal3.multiply(bsoal3)));
        System.out.println(); //Soutln kosong, cuma untuk memberi jarak soal satu dengan soal berikutnya
        
        // SOAL 4
        System.out.println("Soal #4");
        
        Scanner scs4 = new Scanner(System.in);
        
        System.out.print("Masukkan panjang persegi panjang : ");
        int asoal4 = scs4.nextInt();
        System.out.print("Masukkan lebar persegi panjang : ");
        int bsoal4 = scs4.nextInt();
        double csoal4 = asoal4 * bsoal4;
        double dsoal4 = 2 * (asoal4 + bsoal4);
        System.out.println("Luas persegi panjang = " + csoal4);
        System.out.println("Keliling persegi panjang = " + dsoal4);
        System.out.println(); //Soutln kosong, cuma untuk memberi jarak soal satu dengan soal berikutnya
        
        // SOAL 5
        System.out.println("Soal #5");
        
        Scanner scs5 = new Scanner(System.in);
        
        System.out.print("Masukkan berat badan : ");
        int asoal5 = scs5.nextInt();
        System.out.print("Masukkan tinggi badan : ");
        float bsoal5 = scs5.nextFloat();
        
        System.out.println("———————————————————————————————");
        System.out.println("berat badan (kg): " + asoal5);
        float csoal5 = asoal5;
        
        float dsoal5 = csoal5 / (bsoal5 * bsoal5);
        System.out.println("tinggi badan (meter): " + bsoal5);
        System.out.println("BMI Anda adalah: " + dsoal5);
        
    }
    
}
