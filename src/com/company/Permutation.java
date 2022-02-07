package com.company;
import java.util.Scanner;
public class Permutation
    {
        public static void main(String[] args) {
            //I'm using scanner to input "n", a three-digit integer which will be used to find maximum possible
            //permutation of its numbers.
            Scanner scan = new Scanner(System.in);
            int n=scan.nextInt();
            scan.close();
            int a, b, c, first, second, third, result;
            a=n/100;
            b=n/10-a*10;
            c=n%10;
            first=java.lang.Math.max(a, java.lang.Math.max(b, c));
            third=java.lang.Math.min(a, java.lang.Math.min(b, c));
            if ((b>=a && b<=c) || (b>=c && b<=a)){
                second=b;
            }
            else if ((a>=b && a<=c) || (a>=c && a<=b)) {
                second=a;
            }
            else {second=c;
            }
            result=first*100+second*10+third;
            System.out.println(result);
        }
    }

