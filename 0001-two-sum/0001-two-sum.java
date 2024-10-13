class Solution {
public int[] twoSum(int[] nums, int target) {
         for(int i=0;i<nums.length;i++){//i=0 1 2
            for(int j=i+1;j<nums.length;j++)//j=1 2 3
            if(nums[i]+nums[j] == target){ //11+15!=9 15+2!=9 2+7 
                return new int[]{i,j};
            }
        }return new int[]{-1,-1};
}
}