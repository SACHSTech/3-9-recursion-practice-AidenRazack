package recursion;

public class DecimalToBinaryConversion {
    public static String toBinary(int n) {
        if (n == 0) {
            return "0";
        }

        if (n == 1) {
            return "1";
        }

        return toBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        System.out.println(toBinary(10));
        System.out.println(toBinary(15));
    }
}