class Solution {
    public int hammingDistance(int x, int y) {
        int ans=x^y;
        int count=0;
        int mask=1;
        for(int i=0;i<32;i++){
            if((ans&mask)!=0){
                count ++;
            }
            mask<<=1;
        }
        return count;
    }
}