package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(3) + 1;

        System.out.println("Try to guess a number between 1-3");

        Scanner scanner =  new Scanner(System.in);
        String input = scanner.nextLine();

        if(secret == Integer.parseInt(input)) {
            //WIN
            System.out.println("You won");
        }
        else {
            //LOSE
            System.out.println("You lost");
        }
    }
}
