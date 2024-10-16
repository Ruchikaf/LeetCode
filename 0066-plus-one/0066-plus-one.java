class Solution {
    public int[] plusOne(int[] digits) {
        int digit=0;
        int n=digits.length; //3
        for(int i=n-1;i>=0;i--){   //i=2 
         if(digits[i] < 9){   
            digits[i] +=1;
            return digits;
         }
         digits[i]=0;
        }
        int[] arr = new int[n + 1];  
        arr[0] = 1;  
        
        return arr;
    }
}