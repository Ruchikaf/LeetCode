class Solution {
    public boolean isCircularSentence(String sentence) {
       int size = sentence.length() - 1;
     //  boolean ans;
        if(sentence.charAt(0)!=sentence.charAt(size)){
           return false;
        }
        for (int i = 1; i <= size; i++){
            if(sentence.charAt(i) == ' '){
               if( sentence.charAt(i-1) != sentence.charAt(i+1)){
                return false;
               }
            }
        }
        return true;


    }
}