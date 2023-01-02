class Solution {
    public boolean detectCapitalUse(String word) {
        String Upstr=word.toUpperCase();
        String lostr=word.toLowerCase();
        String str =word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        if(word.equals(Upstr)||word.equals(lostr)||word.equals(str)){
            return true;
        }
           return false;
    }
}