class Solution {
    public int[] finalPrices(int[] price) {
        int size=price.length;
        int[] result = price.clone();
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(price[j] <= price[i]){
                    result[i]=result[i]-price[j];
                    break;
                }
            }
        }
        return result;
    }
}