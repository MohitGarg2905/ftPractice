package com.fashionTech.pallavBanka.controlStatements;

public class BubbleSort {
    public static void main(String []args){
        int a[] = {3,60,35,2,45,320,5};
        int n=a.length;
        for (int i=0;i<n;i++){
            for (int j=1;j<(n-i);j++){
                if(a[j]<=a[j-1]){
                    int temp= a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
