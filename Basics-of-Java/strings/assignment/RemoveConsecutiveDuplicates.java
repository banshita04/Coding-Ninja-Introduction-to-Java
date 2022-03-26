package strings.assignment;

public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String input) {
        String ans="";
        for(int i=0;i<input.length()-1;i++)
        {
            if(input.charAt(i)!=input.charAt(i+1))
                ans=ans+input.charAt(i);
        }
        ans=ans+input.charAt(input.length()-1);
        return ans;
    }
}
