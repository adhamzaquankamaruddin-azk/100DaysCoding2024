public class Day78 {
    
    public static void main(String[] args) {
        String nama1 = "Adham";
        String nama2 = "adham";
        String nama3 = "adhan";
        
        boolean nilaiSama = nama1.equalsIgnoreCase(nama2);
        boolean nilaiTidakSama = nama1.equalsIgnoreCase(nama3);
        
        System.out.println(nilaiSama);
        System.out.println(nilaiTidakSama);
    }
}
