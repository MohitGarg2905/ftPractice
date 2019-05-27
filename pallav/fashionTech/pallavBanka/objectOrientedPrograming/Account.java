package com.fashionTech.pallavBanka.objectOrientedPrograming;

public class Account {
    int accno;
    String name;
    float amount;
    void insert (int an, String n, float a){
        accno = an;
        name = n;
        amount = a;
    }
    void deposit (float a){
        amount += a;
    }
    void withdrawl (float a) {
        if (amount < a) {
            System.out.println("Insufficient Balance");
        } else
            amount = amount - a;
    }
    void checkBalance(){
            System.out.println("Balance:" + " " + amount);
    }
}

class TestAccount{
    public static void main(String[] args){
        Account a1=new Account();
        a1.insert(832345,"Ankit",1000);
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdrawl(15000);
        a1.checkBalance();
    }
}
