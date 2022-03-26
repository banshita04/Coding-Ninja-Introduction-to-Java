package strings.assignment;

public class CheckPermutation {
    public static boolean isPermutation(String input1, String input2) {

        if (input1.length() != input2.length())
            return false;
        if (input1.length() == 1 && input2.length() == 1) {
            if (input1.charAt(0) != input2.charAt(0))
                return false;
        }
        int arr[] = new int[256];

        for (int i = 0; i < input1.length(); i++) {
            int val = (int) input1.charAt(i);
            arr[val] = arr[val] + 1;

            for (int j = 0; j < input2.length(); j++) {
                int value = (int) input2.charAt(j);
                arr[value] = arr[value] - 1;
            }
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] != 0)
                    return false;
            }
        }
            return true;
    }
}