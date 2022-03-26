package strings.assignment;

public class HighestOccuringCharacter {
    public static char highestOccuringChar(String inputString) {
        // Write your code here
        int arr[]=new int[256];
        for(int i=0;i<inputString.length();i++){
            arr[inputString.charAt(i)]=arr[inputString.charAt(i)]+1;
        }

        int largest=Integer.MIN_VALUE;
        char ans='0';
        for(int j=0;j<inputString.length();j++){
            int k=arr[inputString.charAt(j)];
            if(k>largest){
                largest=k;
                ans=inputString.charAt(j);
            }

        }
        return ans;
    }
}
