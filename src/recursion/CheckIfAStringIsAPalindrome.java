package recursion;

public class CheckIfAStringIsAPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("tacocat"));
    }
}