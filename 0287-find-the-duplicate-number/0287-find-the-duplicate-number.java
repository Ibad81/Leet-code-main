class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int fre[]=new int[n];
        for(int i=0;i<nums.length;i++){
            if(fre[nums[i]]==0){
                fre[nums[i]]=+1;
            }
            else{
                return nums[i];
            }
        }
        return 0;
    }
}