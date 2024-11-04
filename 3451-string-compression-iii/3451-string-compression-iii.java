class Solution {
    public String compressedString(String word) {
       StringBuilder comp =new StringBuilder();
     
        int count=0;
       
            for(int i=0;i<word.length();){
                char c=word.charAt(i) ;
                while(i<word.length() && count<9 && word.charAt(i) == c){
                    count++;
                    i++;
                }
                comp.append(count).append(c);
                count =0;
            }
        
        return comp.toString();
    }
}