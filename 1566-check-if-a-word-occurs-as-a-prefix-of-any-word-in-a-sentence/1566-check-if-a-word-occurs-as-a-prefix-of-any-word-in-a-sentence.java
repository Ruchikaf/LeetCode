class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int size = sentence.length();
        String[] words = sentence.split(" ");
        // int wordlen = 0;
        for(int i=0; i<words.length;i++){
            // for(int j=0; j<words[i].length;j++){
                if(words[i].indexOf(searchWord) == 0){
                    return i+1;
                }
            //}
        }
        return -1;

    }
}