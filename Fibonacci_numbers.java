import java.util.Arrays;
import java.util.Scanner;

import javax.print.PrintService;

public class Fibonacci_numbers{
    public static int  f(int n,int dp[]){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1)return dp[n];
        return dp[n]=f(n-1,dp)+ f(n-2,dp);
        
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        // int []dp=new int[n+1];
        // Arrays.fill(dp,-1);

        // System.out.println(f(n,dp));

        int pre2=0;
        int pre=1;
        for (int i = 2; i <= n; i++) {
            int curi=pre2+pre;
            pre2=pre;
            pre=curi;
        }
        System.out.println(pre);
    }
}