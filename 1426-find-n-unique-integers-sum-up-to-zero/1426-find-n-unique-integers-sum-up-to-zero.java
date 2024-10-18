class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int temp = n / 2;  // Starting with n/2 for the value assignment
        int start = 0; 
        int end = n - 1;
        
        // Fill from both ends towards the center
        while (start < end) {
            arr[start] = -temp;  // Negative value at the start
            arr[end] = temp;     // Positive value at the end
            temp--;              // Decrease temp for next iteration
            start++;
            end--;
        }
        
        
        if (n % 2 != 0) {
            arr[start] = 0;
        }
        
        return arr;
    }
}
