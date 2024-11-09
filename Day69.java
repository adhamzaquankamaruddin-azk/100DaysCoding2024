// Soal #1
import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        
        int fakt = 1;
        
        System.out.print(angka + "! = ");
        for(int i = angka; i >= 1; i--) {
            if(i == 1) {
                System.out.print(i + " = ");
            } else {
                System.out.print(i + " + ");
            }
            fakt *= i; 
        }
        System.out.println(fakt + "\n");
    }
}

// Soal #2
public class Soal2 {
        int angka = 1;
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }
}

// Soal 3
import java.util.Scanner;
public class Soal3 {
    public static void main(String[] args) {
        int angka;
        do {
            System.out.print("Masukkan angka : ");
            angka = sc.nextInt();
            
            if(angka % 2 == 0 && angka % 3 == 0) {
                System.out.println("Angka adalah kelipatan 2 dan kelipatan 3. Masukkan angka lagi.");
            } else if(angka % 2 == 0) {
                System.out.println("Angka adalah kelipatan 2");
            } else if(angka % 3 == 0) {
                System.out.println("Angka adalah kelipatan 3");
            }
        } while(angka % 2 == 0 && angka % 3 == 0);
    }
}

//Soal #4
public class Soal4 {
    public static void main(String[] args) {
        Soal4 evaluasi = new Soal4();
        evaluasi.salam("Andri!");
        evaluasi.salam("Adam!");
        evaluasi.salam("Patima!");
        evaluasi.salam("Rusna!");
    }
    public void salam(String nama) {
        System.out.println("Halo, " + nama);
    }
}

//Soal 5
public class Soal5 {
    public static void main(String[] args) {
        Soal5 evaluasi = new Soal5();
        int hasil = evaluasi.kali(2,5);
        System.out.println("Hasil perkalian = " + hasil);
    }
    public int kali(int a, int b) {
        int hasil = a * b;
        return hasil;
    }
}

//Soal 6
public class Soal6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
