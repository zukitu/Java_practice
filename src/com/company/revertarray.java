package com.company;
import java.util.Arrays;
//Reverting a given integer array and printing it on the screen.
public class revertarray {
    public static void main(String[] args) {
        int[] nums= new int[]{2, 4, 56, 58, 88, 8, 10};
        for(int i=0; i<(nums.length/2); i++){
            if ((nums[i])%2==0 && (nums[(nums.length-1-i)])%2==0)
            {
                int temp=nums[i];
                nums[i]=nums[(nums.length-1-i)];
                nums[(nums.length-1-i)]=temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
