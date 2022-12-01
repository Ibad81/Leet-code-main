class Solution {
    public List<Integer> getRow(int rowIndex) {
        // List<Integer> res=new ArrayList<>();
        // res.add(1);
        // if(rowIndex==0){
        //     return res;
        // }
        // for(int i=0;i<rowIndex;i++){
        //     for(int j=i;j>0;j--){
        //         res.set(j,res.get(j)+res.get(j-1));
        //     }
        //     res.add(1);
        // }
        // return res;
        
        
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        res.get(0).add(1);
        for( int i=1;i<rowIndex+1;i++){
            List<Integer> cur=new ArrayList<>();
            cur.add(1);
            for(int j=1;j<i;j++){
                cur.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            cur.add(1);
            res.add(cur);
        }
        return res.get(res.size()-1);
    }
}