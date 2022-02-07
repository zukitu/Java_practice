package com.company;
//This one counts number of "1" in binary representation of given integer "n"
//and displays it on the screen.
public class Count1s {
    public static void main(String[] args) {
        int n=456;
        Integer num=n;
        String binary=Integer.toBinaryString(num);
        System.out.println("Binary for "+n+" is " + binary);
        char lookup = '1';
        int count = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == lookup) {
                count++;
            }
        }
        System.out.println("Amount of 1's in " +n+" is "+count);
    }
}
