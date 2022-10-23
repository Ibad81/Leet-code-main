package SDE_Sheet;

import java.util.Scanner;



public class Duplicate_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]=new int [6];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        int n=nums.length;
        int fre[]=new int[n];
        for(int i=0;i<nums.length;i++){
            if(fre[nums[i]]==0){
                fre[nums[i]]=+1;
            }
            else{
                System.out.println(nums[i]);
            }
        }
        
    }
}
