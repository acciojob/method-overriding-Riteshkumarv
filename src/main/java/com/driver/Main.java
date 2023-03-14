package com.driver;

public class Main {
    public static void main(String []args){
        A obj = new B();
        System.out.print(obj.meth());
    }
}
class A{
   static String meth(){
        return "Invoked method from class A";
    }
}
class B extends A{
    static String meth(){
        return "Invoked method from class B";
    }
}