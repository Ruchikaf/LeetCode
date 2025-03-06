class Solution {
    public int majorityElement(int[] nums) {

        // Boyer-Moore Voting Algorithm

        int n = nums.length;
        int count = 0;
        Integer maj = null;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                maj = nums[i];
            } else if (nums[i] == maj) {
                count++;
            } else {
                count--;
            }
        }

        return maj;
    }
}