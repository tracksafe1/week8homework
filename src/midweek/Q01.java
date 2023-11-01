package midweek;
/*1. Take 10 integers from keyboard using loop and print their average value on the
screen.*/

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner numbers= new Scanner(System.in);
        int sum=0;



        for (int i=1;i<=10;i++){
            System.out.println("enter the value"+i+ "=");
            int numbers1=numbers.nextInt();
            sum += numbers1;
        }
        int Average=(sum/10);
        System.out.println("Average is ="+Average);
    }

}
