class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int size1 = str1.length();
        int size2 = str2.length();

        if (size1 < size2) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < size1 && j < size2) {
            if ( (str1.charAt(i) == str2.charAt(j)) || (str1.charAt(i) + 1 == str2.charAt(j)) || 
               (str1.charAt(i) - 25 == str2.charAt(j)) ) {
                j++;
            }
            i++;
        }
     return j == size2;
    }

}