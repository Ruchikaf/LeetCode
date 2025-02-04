class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0]; // Initialize maxSum with the first element
        int currentSum = nums[0]; // Keep track of the sum of the current ascending subarray
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i]; // Continue the ascending subarray
            } else {
                currentSum = nums[i]; // Restart from the new element
            }
            maxSum = Math.max(maxSum, currentSum); // Update maxSum if currentSum is greater
        }
        
        return maxSum;
    }
}
