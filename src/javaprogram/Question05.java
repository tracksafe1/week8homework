package javaprogram;

import java.util.Scanner;

/*5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,percentage*/
public class Question05 {
    public static void main(String[] args) {



marksheet();
    }
    public static void marksheet() {
        Scanner marksheet1 = new Scanner(System.in);
        System.out.println("Enter student name :");
        String studentname = marksheet1.nextLine();
        System.out.println("Enter Roll no");
        int Rollno = marksheet1.nextInt();
        System.out.println("Enter English marks :");
        int Englishmarks = marksheet1.nextInt();
        System.out.println("Maths marks :");
        int Mathsmarks = marksheet1.nextInt();
        System.out.println("science marks");
        int Sciencemarks = marksheet1.nextInt();

        int Total = (Englishmarks + Mathsmarks + Sciencemarks);
        System.out.println("Total  :"+Total);
        int percentage = (Total / 3);
        System.out.println("Percentage  :"+percentage+"%");
        if (percentage>=80){
            System.out.println("Grade = A++" + " Pass ");
        } else if (percentage>=60) {
            System.out.println("Grade = A" + " Pass ");}
            else if (percentage>=50){
                System.out.println("Grade B" + " Pass ");}
                else if(percentage>=35){
                    System.out.println("Grade C" + " Pass ");
                } else  {
            System.out.println("Fail");

        }
        System.out.println("_________________________________________");
        System.out.println("|         Marksheet                      |");
        System.out.println("|         Name :"+ studentname+"                       |");
        System.out.println("|         Rollno :"+Rollno+"                     |");
        System.out.println("|                                        |");
        System.out.println("|________________________________________|");
        System.out.println("|----------------------------------------|");
        System.out.println("|  English Marks: "+ Englishmarks+"                     |");
        System.out.println("|  Maths Marks  : "+ Mathsmarks+"                     |");
        System.out.println("|  Science Marks: "+ Sciencemarks+"                     |");
        System.out.println("|----------------------------------------|");
        System.out.println("|    Total  : "+Total+"                        |");
        System.out.println("|----------------------------------------|");
        System.out.println("|  Percentage: "+ percentage+"                        |");
        System.out.println();
        System.out.println("|----------------------------------------|");

    }
            
        }








