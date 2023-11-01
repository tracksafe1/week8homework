package midweek;/*Take two int values from user and print greatest among them.*/

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        greatestnumber();

    }
    public static void greatestnumber(){
        Scanner Greatestnumber=new Scanner(System.in);
        System.out.println("enter first no :");
        int num1=Greatestnumber.nextInt();
        System.out.println("Enter second no :");
        int num2=Greatestnumber.nextInt();
        if(num1>num2){
            System.out.println("greatest no :"+num1);
        }else{
            System.out.println("greatest no :"+num2);
        }

    }
}
