package SDE_Sheet;

import java.util.Scanner;

public class Sort_colous {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]=new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();

        }
        
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            switch(nums[mid]){
                case 0:{
                    int temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    mid++;low++;
                    break;

                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;
                    high--;
                    break;
                }

            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }
}
