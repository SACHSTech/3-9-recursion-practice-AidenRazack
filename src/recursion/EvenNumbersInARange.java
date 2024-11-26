package recursion;

public class EvenNumbersInARange {
    public static void printEvens(int start, int end) {
        if (start > end) {
            return;
        }

        if (start % 2 == 0) {
            System.out.println(start);
            printEvens(start + 2, end);
        } else {
            printEvens(start + 1, end);
        }
    }
    public static void main(String[] args) {
        printEvens(3,13);
    }
}
