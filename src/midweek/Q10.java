/*10. Write a program to print the sum of two numbers entered by user by defining your
        own method.*/
package midweek;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
     sumof2numbers();
    }
    public static void sumof2numbers(){
        Scanner Sumof2numbers=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstnumber=Sumof2numbers.nextInt();
        System.out.println("Enter second number");
        int secondnumber=Sumof2numbers.nextInt();
        System.out.println("sum of two numbers = "+(firstnumber+secondnumber));
    }
}
