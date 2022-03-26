package strings.problems;

public class StringPalindrome {
    public static boolean isPalindrome(String str) {
        String copy = str, rev = "";

        for (int i = 0; i < str.length(); i++){
            rev = str.charAt(i) + rev;
        }

        return (str.equals(rev));
    }

}
