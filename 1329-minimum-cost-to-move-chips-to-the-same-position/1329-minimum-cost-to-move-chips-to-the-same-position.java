class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenPosition=0;
        int oddPosition=0;
        for(int i:position){   //i=1
         if(i%2 == 0){
            oddPosition++;
         }else{
            evenPosition++;
         }
        }
        return Math.min(oddPosition,evenPosition);
    }
}