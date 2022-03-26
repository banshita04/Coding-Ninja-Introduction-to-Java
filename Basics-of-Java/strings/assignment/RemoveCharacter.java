package strings.assignment;

public class RemoveCharacter {
    public static String removeAllOccurrencesOfChar(String input, char c) {
        if(input.length()==0)
            return "";
        String ans = "";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!=c)
                ans = ans + input.charAt(i);
        }
        return ans;
    }
}
