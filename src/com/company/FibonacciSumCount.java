package com.company;

import java.util.Arrays;

public class FibonacciSumCount {
    public static void main(String[] args) {
        int n=4;
        int fiboArr[]=new int[n];
        for(int y=0; y<n; y++){
            switch(y){
                case 0:
                    fiboArr[y]=0;
                    break;
                case 1:
                    fiboArr[y]=1;
                    break;
                case 2:
                    fiboArr[y]=1;
                    break;
                default:
                    fiboArr[y]=fiboArr[y-1]+fiboArr[y-2];
            }
        }
        int count=0;
        for (int i=0; i<n; i++){
            count+=fiboArr[i];
        }

        System.out.println(Arrays.toString(fiboArr));
        System.out.println(count);
    }
}
