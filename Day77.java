public class Day77 {
    
    public static void main(String[] args) {
        String nama1 = "Adham";
        String nama2 = "Adham";
        String nama3 = "adham";
        
        boolean nilaiSama = nama1.equals(nama2);
        boolean nilaiTidakSama = nama1.equals(nama3);
        
        System.out.println(nilaiSama);
        System.out.println(nilaiTidakSama);
    }
}
