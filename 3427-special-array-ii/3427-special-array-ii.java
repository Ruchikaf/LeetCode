class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n=nums.length;
      int m = queries.length;

         int[] validRightMostIdx = new int[n];
        int i=0;int j=0;
        while(i<n){
            if(i>j){
                j=i;
            }
            while(j+1 < n && nums[j]%2 != nums[j + 1] % 2){
                j++;
            }
            validRightMostIdx[i]=j;
            i++;
        }
        boolean[] result = new boolean[m];
;
        for (int k = 0; k < m; k++) {
            int start = queries[k][0];
            int end = queries[k][1];

            if (end <= validRightMostIdx[start]) {
                result[k] = true;
            } else {
                result[k] = false;
            }
        }
        return result;
    }
}