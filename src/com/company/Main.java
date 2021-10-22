package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world!");
        for (int i = 0; i < 5; i++) {
            System.out.println(sqr(i));
        }
    }

    public static int sqr(int number) {
        return number*number;
    }
}
