import java.util.HashSet;
import java.util.Set;
class Solution {
    public int findCenter(int[][] edges) {
        // Set<Integer> outEdgesFound=new HashSet<>();
        // for(int []edge:edges){
        //     if(outEdgesFound.contains(egde[0])){
        //         return edge[0];
        //     }
        //     outEdgesFound.add(edge[0]);
        //     if(outEdgesFound.contains(edges[1])){
        //         return edge[1];
        //     }
        //     outEdgesFound.add(edge[1]);
        // }
        // return -1;
        if(edges[0][0]==edges[1][0]||edges[0][0]==edges[1][1]){
            return edges[0][0];
        }
        return edges[0][1];
    }
}