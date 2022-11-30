class Solution {
    public String toLowerCase(String s) {
        // String str=s.toLowerCase();
        
        char ch[]=s.toCharArray();
        
        
        String res="";
        for(char i=0;i<ch.length;i++){
            if(Character.isUpperCase(ch[i])){
                res+=(char)(ch[i]+32);
            }
            else{
                res+=ch[i];
            }
        }
        return res;
    }
}