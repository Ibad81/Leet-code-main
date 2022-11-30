class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int pair=0;
        for(int i=0;i<s.length();i++){
            if(pair%2==0){
                if(s.charAt(i)=='*'){
                    count++;
                }
            }
            if(s.charAt(i)=='|'){
                pair++;
            }
        }
        return count;
    }
}