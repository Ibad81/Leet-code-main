class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> hm=new HashMap<>();
        for(int i=0;i<names.length;i++){
            hm.put(heights[i],names[i ]);
            
        }Arrays.sort(heights);
        
        
        String []str=new String[names.length];
        int index=0;
        for(int i=names.length-1;i>=0;i--){
            str[index++]=hm.get(heights[i]);
        }
        return str;
    }
}