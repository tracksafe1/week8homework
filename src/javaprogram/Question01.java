package javaprogram;

import java.util.Scanner;

/*Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)*/
public class Question01 {
    public static void main(String[] args) {
        Scanner oddeven= new Scanner(System.in);
        System.out.println("Enter a number");
        int number= oddeven.nextInt();
        String oddevencheck=(number%2==0)?"Even":"odd";
        System.out.println("number is " +oddevencheck);
    }
}
