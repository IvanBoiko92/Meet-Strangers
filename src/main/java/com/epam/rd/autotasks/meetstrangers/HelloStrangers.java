package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if (number < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {
            for (int i = 1; i <= number; i++) {
                Scanner scan = new Scanner(System.in);
                String name = scan.nextLine();
                names.add(name);
            }
            for(String name : names){
                System.out.println("Hello, " + name);
            }
        }
    }
}
