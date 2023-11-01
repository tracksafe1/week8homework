package javaprogram;
/*Write a java program to get numbers from users and print whether it is positive or n*/

import java.util.Scanner;

public class Question12 {



            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter character between A to C : " );
                String city = sc.next();

                switch (city){
                    case "A":
                        System.out.println("Ahmedabad");
                        break;
                    case "B":
                        System.out.println("Baroda");
                        break;
                    case "C":
                        System.out.println("Chandigadh");
                        break;
                    case "D":
                        System.out.println("Delhi");
                        break;
                    case "E":
                        System.out.println("Eluru");
                        break;
                    case "F":
                        System.out.println("Faridabad");
                        break;

                    default:
                        System.out.println("Invalid Input");
                }
            }
        }


