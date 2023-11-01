package javaprogram;/*11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
other alphabet should be invalid entry.*/

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
printcity();
    }
    public static void printcity(){
        Scanner printcity1=new Scanner(System.in);
        System.out.println("Enter any value between A to F=");
        char enteralphabet=printcity1.next().charAt(0);
        if (enteralphabet=='A'){
            System.out.println("City= Allahabad");
        } else if (enteralphabet=='B') {
            System.out.println("City=Bombay");}
            else if (enteralphabet=='C'){
            System.out.println("City=Calcutta");}
                else if (enteralphabet=='D'){
                System.out.println("City=Delhi");}
                else if(enteralphabet=='E'){
                System.out.println("City=Eluru");}
                else if(enteralphabet=='F')
                {System.out.println("City=Faridabad");}
                else{
            System.out.println("NOT VALID");
            }

        }


    }

