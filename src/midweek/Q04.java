package midweek;/*Take values of length and breadth of a rectangle from user and check if it is square or not.*/

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Q04 t=new Q04();
        t.rectangleorsquare();
    }
    public void  rectangleorsquare(){
        Scanner rectanglesquare=new Scanner(System.in);
        System.out.println("enter the value of length");
        int length=rectanglesquare.nextInt();
        System.out.println("enter the value of width");
        int width=rectanglesquare.nextInt();
        if(length==width){
            System.out.println("it is a square");
        }
        else {
            System.out.println("it is a rectangle");

    }
}}
