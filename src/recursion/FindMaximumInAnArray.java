package recursion;

public class FindMaximumInAnArray {
    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int currentMax = findMax(arr, n - 1);
        if (currentMax > arr[n - 1]) {
            return currentMax;
        } else {
            return arr[n - 1];
        }
    }
    
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 9, 2};
        int n = 3;
        System.out.println(findMax(array, n));
    }
}

