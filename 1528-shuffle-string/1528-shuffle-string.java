class Solution {
    public String restoreString(String s, int[] indices) {
        String str="";
//         for(int i=0;i<indices.length;i++){
//             for(int j=0;j<s.length();j++){
//                 if(indices[j]==i){
//                 str+=s.charAt(j);
//                 }
//             }
            
//         }
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[indices[i]]=s.charAt(i);
        }
        // for(int i=0;i<arr.length;i++){
        //     str+=arr[i];
        // }
        String string = new String(arr);

        // str=arr.toString();
        return string;
    }
}