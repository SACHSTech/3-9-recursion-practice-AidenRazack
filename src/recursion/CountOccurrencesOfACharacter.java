package recursion;

public class CountOccurrencesOfACharacter {
    public static int countChar(String s, char c) {
        if (s.isEmpty()) {
            return 0;
        }

        int count = 0;
        if (s.charAt(0) == c) {
            count = 1;
        }
        return count + countChar(s.substring(1), c);
    }

    public static void main(String[] args) {
        String str = "hello";
        char target = 'l';
        System.out.println(countChar(str, target));
    }
}
