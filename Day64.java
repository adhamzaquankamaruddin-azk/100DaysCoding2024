public class Day64 {
    public static void main(String[] args) {
        duaLoop:
        for (int i = 1; i <= 3; i++) {
            for (int a = 1; a <= 3; a++) {
                if (i == 2 && a == 2) {
                    break duaLoop;
                }
                System.out.println("i: " + i + ", a: " + a);
            }
        }
    }
}
