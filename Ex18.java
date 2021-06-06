/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */
import java.util.*;

public class Ex18
{

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String choice;
        int temp ;
        int C,F;
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        choice = kb.next();

        if(choice.equalsIgnoreCase("F")){
            System.out.println("Please enter the temperature in Celsius: ");
            temp = kb.nextInt();
            F = (temp - 9 / 5) + 32;
            System.out.print("The temperature in Fahrenheit is " + F);
        }
        else if(choice.equalsIgnoreCase("C"))
        {
            System.out.println("Please enter the temperature in Fahrenheit: " );
            temp = kb.nextInt();
            C = (temp - 32) * 5 / 9;
            System.out.print("The temperature in Celsius is " + C);

        }



    }
}
