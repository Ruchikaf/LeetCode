
class Solution {
    public int removeElement(int[] nums, int val) {
        //nums={3,2,2,3} 
        int k=0; 
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){ //3!=3 2!=3
                nums[k++]=nums[i]; //nums[0]=2,nums[1]=2
            }
        }
        return k;
    }
}
