package com.company;
import java.util.Arrays;

public class Int2string2intarray {
    public static void main(String[] args) {
        int n=12345;
        Integer nn=n;
        String nstr= nn.toString();
        int [] intArray = new int[nstr.length()];
        for (int i = 0; i < nstr.length(); i++) {
            intArray[i] = Character.digit(nstr.charAt(i), 10);
        }
        System.out.println(nstr);
        System.out.println(Arrays.toString (intArray));
        int sum=0;
        for (int y=0; y<nstr.length(); y++) {
            if (intArray[y]%2>0) {
                sum+=intArray[y];
            }
        }
        System.out.println(sum);
    }
}
