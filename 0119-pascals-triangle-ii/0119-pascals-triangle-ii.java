class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        res.add(1);
        if(rowIndex==0){
            return res;
        }
        for(int i=0;i<rowIndex;i++){
            for(int j=res.size()-1;j>0;j--){
                res.set(j,res.get(j)+res.get(j-1));
            }
            res.add(1);
        }
        return res;
        
        
        
    }
}