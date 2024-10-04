public class Day33 {
    
    public static void main(String[] args) {
        //Casting adalah teknik yang di gunakan untuk merubah bentuk tipe data
        
        //byte -> float
        byte CastOff = 13;
        float PutOn = CastOff;
        
        System.out.println("Tipe data byte : " + CastOff);
        System.out.println("Tipe data float : " + PutOn);
        
        //float -> byte
        float ClockUp = 26.0f;
        byte ClockOver = (byte) ClockUp;
        
        System.out.println("Tipe data float : " + ClockUp);
        System.out.println("Tipe data byte : " + ClockOver);
    }
    
}
