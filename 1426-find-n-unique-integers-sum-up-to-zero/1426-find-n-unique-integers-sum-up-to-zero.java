class Solution {
    public int[] sumZero(int n) {
         int [] arr=new int[n];
        //  int temp=n/2; //2
        //    int start=0; 
        //     int end=n-1;
        int k=0;
        for(int i=1;i<=n/2;i++){
            arr[k++]= i;  
            arr[k++]= -i;  
           
        }
        if(n%2 !=  0){
            arr[k]=0;
        }
         return arr;
    }
}