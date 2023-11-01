package javaprogram;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
      numberstatus();
    }
    public static void numberstatus(){
        Scanner numbertype=new Scanner(System.in);
        System.out.println("Enter the  number:");
        int number= numbertype.nextInt();
        if(number>0){
            System.out.println("number is positive");}
        else if (number<0){
            System.out.println("number is negative");}
        else{
            System.out.println("number is 0");
        }
    }
}
