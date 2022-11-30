class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String ans[]=new String[words.length];
        for(int i=0;i<words.length;i++){
            for (int j = 0; j < words[i].length(); j++) {
                int index=(int)words[i].charAt(j)-97;
                ans[i]+=arr[index];
                
            }
        }
        Set<String> res=new HashSet<>();
        for(int i=0;i<ans.length;i++){
            res.add(ans[i]);
        }
        return res.size();
    }
}