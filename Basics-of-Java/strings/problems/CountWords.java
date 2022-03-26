package strings.problems;

public class CountWords {
    public static int countWords(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ' || i == str.length()-1)
                count++;
        }
        return count;
    }

}
