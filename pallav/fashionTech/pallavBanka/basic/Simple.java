package com.fashionTech.pallavBanka.basic;

class Simple{
    public static void main(String args[]){
     String s="FashionTech";
     System.out.println(s);
     int a=10;
     int b=10;
     int c=a+b;
     System.out.println(c);
     int d=10;
     float e=d;
     System.out.println(d);
     System.out.println(e);
     float f=10.5f;
     //int a=f;//Compile time error
     int g=(int)f;
     System.out.println(f);
     System.out.println(g);
     //Overflow
     int h=130;
     byte i=(byte)h;
     System.out.println(h);
     System.out.println(i);
     byte j=10;
     byte k=10;
     //byte c=a+b;//Compile Time Error: because a+b=20 will be int
     byte l=(byte)(j+k);
     System.out.println(l);
    }  
}

