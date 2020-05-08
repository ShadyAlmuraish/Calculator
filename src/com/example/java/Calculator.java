package com.example.java;

import java.util.Scanner;

import static com.example.java.util.MathMethods.*;

public class Calculator {

    public static void main(String[] args) {
        String hideme = getInput("Enter a numeric value: ");
        String strring1 = getInput("Enter a numeric value: ");
        String myinput = getInput("Choose an operation (+ - * /):");

        double result;

        try {
            switch (myinput) {
                case "+":
                    result = addValues(hideme, strring1);
                    break;
                case "-":
                    result = subtractValues(hideme, strring1);
                    break;
                case "*":
                    result = multiplyValues(hideme, strring1);
                    break;
                case "/":
                    result = divideValues(hideme, strring1);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
