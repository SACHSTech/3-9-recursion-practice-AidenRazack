package recursion;

public class SubsetsOfASet {
    public static void generateSubsets(String s) {
        // empty prefix
        generateSubsetsHelper(s, "", 0);
    }

    private static void generateSubsetsHelper(String s, String current, int index) {
        // Base case (checks if we looked at all the characters)
        if (index == s.length()) {
            System.out.println(current);
            return;
        }

        generateSubsetsHelper(s, current, index + 1);
        generateSubsetsHelper(s, current + s.charAt(index), index + 1);
    }

    public static void main(String[] args) {
        String input = "abc";
        generateSubsets(input);
    }
}
