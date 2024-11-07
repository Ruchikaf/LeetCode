class Solution {
    public int largestCombination(int[] candidates) {
        int maxGrpSize=0;
        for(int bitPos=0;bitPos<24;bitPos++){
            int count=0;
            for(int num:candidates){
                if ((num & (1 << bitPos)) != 0){
                    count++;
                }
                maxGrpSize= Math.max(maxGrpSize,count);
            }
        }return maxGrpSize;
    }
}