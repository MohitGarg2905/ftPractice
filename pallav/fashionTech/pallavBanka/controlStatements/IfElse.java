package com.fashionTech.pallavBanka.controlStatements;

public class IfElse {
    public static void main(String args[]) {
        //Creating two variables for age and weight
        int age=18;
        int weight=48;
        //applying condition on age and weight
        if(age>=18){
            if(weight>50){
                System.out.println("You are eligible to donate blood");
            } else{
                System.out.println("You are not eligible to donate blood");
            }
        } else{
            System.out.println("Age must be greater than 18");
        }
    }
}
