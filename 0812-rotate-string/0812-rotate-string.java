class Solution {
    public boolean rotateString(String s, String goal) {
        int m=s.length();
        int n=goal.length();
        if(m!=n){
            return false;
        }
        for(int rotate = 1 ; rotate<=m ; ++rotate){
         //performing one rotation by shifting
         s=s.substring(1)+s.charAt(0);
         if(s.equals(goal)){
            return true;
         }
        }
        return false;
    }
}