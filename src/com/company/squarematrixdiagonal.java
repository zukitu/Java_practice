package com.company;
import java.util.Arrays;

public class squarematrixdiagonal {
    public static void main(String[] args) {
        int nums [][]  = new int[][]{{2, 1, 50},{45, 23, 5},{21,76,2}};
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                if (i<j) {
                    nums[i][j]=0;
                }
                else if (i>j){
                    nums[i][j]=1;
                }
            }
        }

        for(int y=0; y<(nums.length); y++){

            System.out.println(Arrays.toString(nums[y]));
        }}
}
