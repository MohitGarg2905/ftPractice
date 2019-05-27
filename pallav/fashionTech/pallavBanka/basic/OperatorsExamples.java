package com.fashionTech.pallavBanka.basic;

public class OperatorsExamples {
    public static void main(String args[]) {
        int x = 10;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10
        int c=10;
        int d=10;
        System.out.println(c++ + ++c);//10+12=22
        System.out.println(d++ + d++);//10+11=21
        int e=10;
        int f=-10;
        boolean g=true;
        boolean h=false;
        System.out.println(~e);//-11 (minus of total positive value which starts from 0)
        System.out.println(~f);//9 (positive of total minus, positive starts from 0)
        System.out.println(!g);//false (opposite of boolean value)
        System.out.println(!h);//true
        //For positive number, >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2);
        int i=10;
        int j=5;
        int k=20;
        System.out.println(i<j&&i++<k);//false && true = false
        System.out.println(i);//10 because second condition is not checked
        System.out.println(i<j&i++<k);//false && true = false
        System.out.println(i);//11 because second condition is checked
        int l=2;
        int m=5;
        int min=(l<m)?l:m;
        System.out.println(min);
    }
}
