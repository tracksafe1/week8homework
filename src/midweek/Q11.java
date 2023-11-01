/*11. Write a program to print a string entered by user.*/
package midweek;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
       printstring();
    }
    public static void printstring(){
        Scanner Printstring =new Scanner(System.in);
        System.out.println("Enter the string tp be printed");
        String string1=Printstring.nextLine();
        System.out.println(string1);
    }
}
