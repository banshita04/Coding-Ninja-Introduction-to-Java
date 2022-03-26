package strings.problems;

public class ReverseStringWordwise {
    public static String reverseWordWise(String input) {
        int lastIndex = 0;
        String ans = "";
        int i = 0;
        for (; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                int currIndex = i;
                String rev = "";
                for (int j = currIndex; j >= lastIndex; j--) {
                    rev = input.charAt(j) + rev;
                }
                ans = rev + ans;
                lastIndex = i + 1;
            }
        }

        int currIndex = i;
        String rev = "";
        for (int j = currIndex - 1; j >= lastIndex; j--) {
            rev = input.charAt(j) + rev;

        }
        rev = rev + " ";
        ans = rev + ans;

        return ans;
    }
}
