class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        boolean flag = false;
        
        for(String s1 : word1) {
            sb1.append(s1);
        }
        
        for(String s2 : word2) {
            sb2.append(s2);
        }
        
        if(sb1.toString().equals(sb2.toString())) {
            return true;
        } else {
            return false;
        }
    }
}