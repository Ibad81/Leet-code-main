import java.util.* ;
import java.io.*; 
public class frog_jump {
    // private static final int Ss = 0;
    public static int f(int indx,int heights[]){
        if(indx==0){
            return 0;
        }
        
        
        
        int left=f(indx-1,heights)+Math.abs(heights[indx]-heights[indx-1]);
        int right=Integer.MAX_VALUE;
        if(indx>1){
            right=f(indx-2, heights)+Math.abs(heights[indx]-heights[indx-2]);

        }
        return Math.min(left, right);
    }
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
        int dp []=new int [n];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i=1;i<n;i++){
            int ss=Integer.MAX_VALUE;
            int fs=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
            if(i>1)
                ss=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
            
            dp[i]=Math.min(fs,ss);
        }
    }

}
