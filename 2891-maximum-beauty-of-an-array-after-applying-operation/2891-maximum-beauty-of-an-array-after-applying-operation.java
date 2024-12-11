class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = 0;
        int maxBeauty = 0;

        // Sliding window
        while (i < n) {
            while (j < n && nums[j] - nums[i] <= 2 * k) {
                j++;
            }

            maxBeauty = Math.max(maxBeauty, j - i);
            i++;
        }

        return maxBeauty;
    }
}