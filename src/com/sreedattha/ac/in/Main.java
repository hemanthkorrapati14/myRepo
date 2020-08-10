package com.sreedattha.ac.in;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth");

        boolean hasNextInt =scanner.hasNextInt();





        if (hasNextInt){
            int yearofbirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("enter your name");
            String name = scanner.nextLine();
            int age = 2020 - yearofbirth;

            if (age >= 0 && age <=100) {
                System.out.println("your name is" + name + "and your age ia" + age + "years old");

            } else
                {
                System.out.println("invalid year of birth");
                }

        }else {
            System.out.println("unable to parse year of birth");
        }


            scanner.close();
    }
}
