package javaprogram;
/*
/   15. Write a program that tells us input value is number or an alphabet orsymbol.*/

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
    Scanner number=new Scanner(System.in);
        System.out.println("Enter the value");
        char value=number.next().charAt(0);
        if(Character.isDigit(value)){
            System.out.println("it is Digit");
        } else if (Character.isAlphabetic(value)){
            System.out.println("it is an Alphabet");
}else{
            System.out.println("it is a symbol");
        }}}

