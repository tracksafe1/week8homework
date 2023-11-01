package javaprogram;

import java.util.Scanner;

/*Write a java program to input any number and find out if it’s odd or even.*/
public class Question07 {
    public static void main(String[] args) {
        Question07 number=new Question07();
        number.oddeven1();
    }
    public void oddeven1(){
        Scanner oddeven= new Scanner(System.in);
        System.out.println("Enter a number");
        int number= oddeven.nextInt();
        String oddevencheck=(number%2==0)?"Even":"odd";
        System.out.println("number is " +oddevencheck);
    }
}

