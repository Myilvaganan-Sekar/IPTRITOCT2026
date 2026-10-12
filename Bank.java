package com.java;

public abstract class Bank {


    public abstract void roi(); //abstract method

    public void bankDetails(){//non abstract method
        System.out.println("Bank details");
    }

    public static void main(String[] args) {
        //Bank bb = new Bank();
    }
}
