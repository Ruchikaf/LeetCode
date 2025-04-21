class Solution {
    public int hIndex(int[] citations) {
        //citations = [3,0,6,1,5]
        int n = citations.length;  //5
        int[] arr = new int[n + 1]; //6

        for (int c : citations) {
            if (c > n)   //5>5
                arr[n]++; 
            else
                arr[c]++;
        }
       //arr = [1,1,0,1,0,2]

        int count = 0; 
        for (int i = n; i >= 0; i--) { 
            count = count + arr[i]; 
            if (count >= i) { 
                return i;
            }
        }
        return 0;
    }
}