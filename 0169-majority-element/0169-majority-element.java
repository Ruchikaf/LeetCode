class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count;
        int res = 0;
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            count = 1;
            for (int j = i; j < n; j++) {
                if (nums[i] == nums[j] && i != j) {
                    count++;
                }
            }
            if (res < count) {
                res = count;
                num=nums[i];
            }
        }
        return num;
    }
}