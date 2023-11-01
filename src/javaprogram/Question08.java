package javaprogram;
/*Write a java program to get numbers from users and print whether it is positive or negative.*/

import java.util.Scanner;

public class Question08 {
    public static void main(String[] args) {
m1();
    }
    public static void m1(){
        Scanner integers=new Scanner(System.in);

        System.out.println("Enter a number");
        int number= integers.nextInt();
               String integercheck=(number>=0)?"positive":"negative";
           System.out.println("number is "+integercheck);
    }}




