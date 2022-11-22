class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr=new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             int n=Math.abs(nums[i]);
//             if(nums[n-1]>0){
//             nums[n-1]=-1*nums[n-1];
//         }
//         }
//         for(int i=0;i<nums.length;i++){
//                 if(nums[i]>0){
//                     arr.add(i+1);
//                 }
                
//             }
        
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[j]==arr.get(j)){
        //             arr.remove(arr.get(j));
        //         }
        //     }
        // }
        
        HashSet<Integer> man=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            man.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!man.contains(i)){
            arr.add(i);
            }
        }
        return arr;
        
    }
}