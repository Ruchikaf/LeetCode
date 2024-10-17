public class Solution {
    public int maximumSwap(int num) {
        
        char[] numArr = Integer.toString(num).toCharArray();

        int[] last = new int[10];
        
        // Fill the last occurrence index for each digit
        for (int i = 0; i < numArr.length; i++) {
            last[numArr[i] - '0'] = i;
        }
 
        for (int i = 0; i < numArr.length; i++) {
            // Check for a larger digit starting from 9 down to the current digit
            for (int d = 9; d > numArr[i] - '0'; d--) {
                // If a larger digit exists and appears later in the number
                if (last[d] > i) {
                    
                    char temp = numArr[i];
                    numArr[i] = numArr[last[d]];
                    numArr[last[d]] = temp;

                    return Integer.parseInt(new String(numArr));
                }
            }
        }
        return num;
    }

  
}
