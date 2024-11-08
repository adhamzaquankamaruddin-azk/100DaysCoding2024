public class Day68 {
    public static void main(String[] args) {
        int sisi = 4;
        int luas = hitungLuasPersegi(sisi);
        System.out.println("Luas persegi: " + luas);
    }

    public static int hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }
}
