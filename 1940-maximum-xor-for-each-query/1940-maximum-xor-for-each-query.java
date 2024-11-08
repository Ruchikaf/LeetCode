class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int size=nums.length;
        int result[] =new int[size];
        // Step 1: Calculate the total XOR of all elements in nums
           int XOR =0;
           for(int xors :nums){
            XOR = XOR ^ xors;
           }
         // Create a mask with all bits set to 1, based on maximumBit
        int mask = (1 << maximumBit)-1;

        // Calculate the result by finding the maximum XOR for each element
        for(int i=0;i<size;i++){
                   result[i] = XOR ^ mask;
                    // Update XOR by removing the last element in the reversed order
                    XOR = XOR ^ nums[size-1-i];
        }
        return result;            
    }
}