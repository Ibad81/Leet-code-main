class Solution {
    public String reverseStr(String s, int k) {
        int len=s.length();
        char[] ch = s.toCharArray();
        int begin=0;
        int step=2*k;
        while(begin<len){
            int end=begin+k-1;
            reverse(ch,begin,end>len-1?len-1:end);
            begin+=step;
        }
        return String.valueOf(ch);
    }
    public void reverse(char[] ch,int i,int j){
        while(i<j){
            swap(ch,i,j);
            i++;
            j--;
        }
        
    }
    public void swap(char[] ch,int i,int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
}