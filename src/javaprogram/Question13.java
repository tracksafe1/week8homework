package javaprogram;/*Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to theirsymbol(using if else)*/

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        mathsaperation();
    }

    public static void mathsaperation(){
        Scanner number=new Scanner(System.in);
        System.out.println("Enter the value of first number");
        int  number1= number.nextInt();
        System.out.println("Enter the value of Second number");
        int number2=number.nextInt();
        System.out.println("enter any one value out of( +,-,*,/)");
        char operation= number.next().charAt(0);
        if(operation=='+'){
            System.out.println(number1+number2);}
           else if(operation=='-'){
                System.out.println(number1-number2);}
           else if(operation=='*'){
            System.out.println(number1*number2);}
           else if(operation=='/'){
            System.out.println(number1/number2);}
           else {
            System.out.println("INVALID");

        }


    }
}
