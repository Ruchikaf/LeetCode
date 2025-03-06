class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (j < 2 || nums[i] > nums[j - 2]) {
                nums[j++] = nums[i];
            }
        }
        return j;

    }
}
