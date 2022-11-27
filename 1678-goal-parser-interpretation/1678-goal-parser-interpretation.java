class Solution {
    public String interpret(String command) {
        String str="";
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='('&&command.charAt(i+1)==')'){
                str+="o";
                i+=1;
            }
            else if(command.charAt(i)=='G'){
                str+="G";
            }
            else{
                str+="al";
                i+=3;
            }
        }
        // String str=command.replace((),'o')||command.replace((al),'al');
        return str;
    }
}