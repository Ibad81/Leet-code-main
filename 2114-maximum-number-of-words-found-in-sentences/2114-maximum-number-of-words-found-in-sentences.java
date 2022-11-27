class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (int j = 0; j < sentences.length; j++) {
            int count=0;
            for (int i = 0; i < sentences[j].length(); i++) {
                if (sentences[j].charAt(i) == ' ') {
                    count++;
                }
                
            }
            ans = Math.max(ans, count);
        }
            return ans+1;
    }
}