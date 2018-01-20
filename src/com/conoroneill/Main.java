package com.conoroneill;

public class Main {

    public static void main(String[] args) {

    double var1 = 20d;
    double var2 = 80d;

    double total = (var1 + var2) * 25;
    double remainder = total % 40;
        System.out.println("total: " + total);
    System.out.println(remainder);

    if(remainder <= 20)
        System.out.println("Total was over the limit");

    }
}
