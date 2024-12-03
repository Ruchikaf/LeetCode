class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder newS = new StringBuilder();
        int size= s.length();
        int spaceSize=spaces.length;
        int spaceIndex=0;
        for(int i=0;i< size;i++){
            
                if(spaceIndex < spaceSize && i == spaces[spaceIndex] ){   
                   newS.append(" ");
                   spaceIndex++;
                }
            newS.append(s.charAt(i));
               
        }
        return newS.toString();
    }
}