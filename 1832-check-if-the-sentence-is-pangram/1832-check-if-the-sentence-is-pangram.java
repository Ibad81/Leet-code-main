class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] ch=sentence.toCharArray();
        Set<Character> set=new HashSet<>() ;

        for(int i=0;i<ch.length;i++){
            set.add(ch[i]);
        // }
        // for (int i = 0; i < ch.length; i++) {
            
        //     System.out.println(set);
        }

        Iterator<Character> i = set.iterator();
 
        // It holds true till there is a single element
        // remaining in the object

        String str="";
        while (i.hasNext()){
 
            str+=i.next();
        }

        // System.out.println(str);
        String mat="abcdefghijklmnopqrstuvwxyz";

        if(str.equals(mat)){

            return true;
        }
        
        return false;
        
    }
}