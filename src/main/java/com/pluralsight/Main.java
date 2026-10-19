package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        int result = 0;
        System.out.println("Enter the first number:");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second number:");
        int secondNum  = scanner.nextInt();


        scanner.nextLine();

        System.out.println("""
                Possible calculations:
                (A)dd
                (S)ubtract
                (M)ultiply
                (D)ivide
                """);
        System.out.println( "Please select an option: ");
        String operation = scanner.nextLine();


        if (operation.equals("A")  || operation.equals("a") ){
            result = firstNum + secondNum;
            System.out.println("Your answer is : " + result);
        } else if (operation.equals("S")  || operation.equals("s") ) {
            result = firstNum - secondNum;
            System.out.println("Your answer is : " + result);
        } else if (operation.equals("M")  || operation.equals("m") ) {
            result = firstNum * secondNum;
            System.out.println("Your answer is : " + result);
        } else if (operation.equals("D")  || operation.equals("d") ) {
            result = firstNum / secondNum;
            System.out.println("Your answer is : " + result);
        } else {
            System.out.println("Error");
        }
       


    }
}


