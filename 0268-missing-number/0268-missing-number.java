class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int substitute []=new int[n+1];
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            substitute[nums[i]]++;
        } 
        for (int i = 1; i <= nums.length; i++) {
            if(substitute[i]==0){
                return i;
            }
        }
        return 0;
    }
    

}