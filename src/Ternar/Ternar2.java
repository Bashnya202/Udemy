package Ternar;

public class Ternar2 {
    public static int max(int left, int right) {
        int maxchislo = left > right ? left : right;
        return maxchislo;
    }

    public static void main(String[] args) {
        int result = Ternar2.max(30, 50);
        System.out.println(result);
    }
}
