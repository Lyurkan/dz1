public class HeroArray {
    public static void main(String[] args) {
        double[] hero = {7, 8, 8, 2, 4, 6, 1, 4, 9, 0, 197, 3.14};
        for (int i = 0; i < 11; i++)
            if (hero[i] % 2 == 0) {
                System.out.println("Even: " + hero[i]);
            }
    }
}
