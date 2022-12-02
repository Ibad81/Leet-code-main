class Solution {
    public String reverseWords(String s) {
        

        StringBuilder st=new StringBuilder();
        
        String []ans=s.split(" ");

        for(int i=0;i<ans.length;i++){
            char[] a=ans[i].toCharArray();
            int alength=a.length-1;

            while(alength>=0){
                st.append(a[alength--]);
            }
            st.append(" ");
            
        
        }
        return st.toString().trim();
    }
}