package javaprogram;
/*Write a java program input sales id, seller's name, sales amount, and salary basic and then
fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2% */

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
 details();
    }
    public static void details(){
        Scanner employeedetails=new Scanner(System.in);
        System.out.println("Enter Sales ID =");
        int salesid= employeedetails.nextInt();
        System.out.println("Enter Seller's name=");
        String sellersname= employeedetails.next();
        System.out.println("Salary = ");
        int salary= employeedetails.nextInt();
        System.out.println("Sales amount=");
        double Salesamount= employeedetails.nextDouble();
        if(Salesamount>=50000){
            System.out.println("Commission is 35% = "+(.30*Salesamount));
        }
        else if(Salesamount>=30000){
            System.out.println("Commission is 20%= "+(.2*Salesamount));
        }
        else if(Salesamount>=20000){
            System.out.println("Commission is 10% ="+(.1*Salesamount));}
            else if(Salesamount >=10000){
                System.out.println("Comission is 5% ="+(.05*Salesamount));
            }
                  else if (Salesamount<10000){
                System.out.println("Commission is 2% ="+(.02*Salesamount));
            }else{
                System.out.println("NO commission");
            }
        }
    }

