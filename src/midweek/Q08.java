package midweek;
/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
     classesattended();
    }
    public static void classesattended(){
        Scanner Classesattended=new Scanner(System.in);
        System.out.println("No of classes held :");
        int numberofclassesheld=Classesattended.nextInt();
        System.out.println("Number of classes attended :");
        int numberofclassesattended=Classesattended.nextInt();
        int Percentage=((numberofclassesattended *100)/numberofclassesheld);
        System.out.println("percentage : "+Percentage);
        if (Percentage>=75){
            System.out.println("Student is allowed to sit in Exams");
        }else{
            System.out.println("Student is  not allowed to sit in Exams");
        }
    }
}
