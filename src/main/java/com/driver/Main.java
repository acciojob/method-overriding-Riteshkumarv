package com.driver;

public class Main {
        public static void main(String []args){
         B obj = new B();
         obj.meth();

         B obj1 = new B();
         obj1.meth();
        }
    static class A{
        String meth(){
            return "Invoked method from class A";
        }
    }
    static class B extends A {
        String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
    }

