package com.fashionTech.pallavBanka.controlStatements;

public class SelectionSort {
    public static void main(String args[]){
        int a[]= {9,14,3,2,43,11,58,22};
        int n=a.length;
        for (int i=0;i<n;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[index])
                    index = j;
            }
            int temp = a[index];
            a[index]=a[i];
            a[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
