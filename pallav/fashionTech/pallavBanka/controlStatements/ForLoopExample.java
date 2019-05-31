package com.fashionTech.pallavBanka.controlStatements;

public class ForLoopExample {
    public static void main(String[] args) {
        //Declaring an array
        int arr[] = {12, 23, 44, 56, 78};
        //Printing array using for-each loop
        for (int i : arr) {
            System.out.println(i);
        }
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }
        for(;;){
        //code to be executed
        }
    }
}

