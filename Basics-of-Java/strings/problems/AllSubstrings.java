package strings.problems;

public class AllSubstrings {
    public static void printSubstrings(String str) {
        for (int i = 0; i  < str.length(); i++){
            for (int j = i; j <= str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
