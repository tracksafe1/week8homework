package midweek;/*A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.*/

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        printinggrade();
    }

    public static void printinggrade() {
        Scanner Printinggrade = new Scanner(System.in);
        System.out.println("enter the marks between 1 to 100 =");
        int marks = Printinggrade.nextInt();
        if (marks > 80) {
            System.out.println("Grade  A");
        } else if (marks > 60 && marks <= 80) {
            System.out.println("Grade  B");
        } else if (marks > 50 && marks <= 60) {
            System.out.println("Grade C");
        } else if (marks > 45 && marks <= 50) {
            System.out.println("Grade D");
        } else if (marks > 25 && marks <= 45) {
            System.out.println("Grade E");
        } else if (marks < 25) {
            System.out.println("Grade F");
        } else {
            System.out.println("invalid");
        }
    }
}