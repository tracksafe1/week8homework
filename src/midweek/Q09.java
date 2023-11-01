package midweek;/*Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
package midweek;*/

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {

        classesattended();
    }
    public static void classesattended(){
        Scanner classesattended1=new Scanner(System.in);
        System.out.println("No of classes held :");
        int numberofclassesheld=classesattended1.nextInt();
        System.out.println("Number of classes attended :");
        int numberofclassesattended=classesattended1.nextInt();
        int Percentage=((numberofclassesattended *100)/numberofclassesheld);
        System.out.println("percentage : "+Percentage+"%");
        System.out.println("Do you have medical cause :");

        char medicalcause=classesattended1.next().charAt(0);
        if ((medicalcause =='Y')|| (Percentage >= 75))
         {
             System.out.println("Student is allowed to sit in Exams");
        }
            else {
            System.out.println("Student is not  allowed to sit in Exams");
        }
    }}

