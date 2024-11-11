class salam {
    public static String perkenalan(String nama, int umur) {
        return nama + " berumur " + umur + " tahun";
    }
}

public class Day71 {
    
    public static void main(String[] args) {
        String panggilan = "Adham";
        int usia = 19;
        System.out.println(salam.perkenalan(panggilan, usia));
    }
    
}
