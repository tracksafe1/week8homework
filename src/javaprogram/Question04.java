package javaprogram;

import java.util.Scanner;

/*Write if else condition and print your group name in console else others group name.*/
public class Question04 {
    public static void main(String[] args) {
        System.out.println("Enter value between 1 to 5 : ");
        m1();
    }

    public static void m1() {
        Scanner groupname = new Scanner(System.in);
        int groupname1 = groupname.nextInt();

        if (groupname1 == 1) {
            System.out.println("AGILE");
        } else if (groupname1 == 2) {
            System.out.println("Code");
        } else if (groupname1 == 3) {
            System.out.println("Code1");
        } else if (groupname1 == 4) {
            System.out.println("Code2");
        } else if (groupname1 == 5) {
            System.out.println("Restassured");
        } else {
            System.out.println("INVALID");
        }

    }


}

