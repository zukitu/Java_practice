package com.company;
//Here I count distance between the first time and the last time the biggest number is met in a given integer array
public class distArray {
    public static void main(String[] args) {
        int []nums=new int[]{2, 100, 5, 10, 1, 50};
        int max=nums[0];
        for(int i=0; i<nums.length; i++){
            if (max<nums[i])   {
                max=nums[i];
            }
        }
        int dist=0;
        int  indexlast=0;
        int indexfirst=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==max){
                indexfirst=i;
                System.out.println(indexfirst);
                break;}}

        for(int i=0; i<nums.length; i++){
            if(nums[i]==max){
                indexlast=i;

            }
        }
        dist=indexlast-indexfirst;
        System.out.println(indexlast);
        System.out.println (max);
        System.out.println(dist);

    }
}
