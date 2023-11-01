package javaprogram;
/*6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format*/

import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Question06 salary= new Question06();
        salary.Salaryslip();

    }
    public void Salaryslip(){
        Scanner Employeedata = new Scanner(System.in);
        System.out.println("Enter Employee ID =");
        int employeeid=Employeedata.nextInt();
        System.out.println("Enter Employee name = ");
        String employeename=Employeedata.next();
        System.out.println(" Enter Employee basic salary =");
        double basicsalary=Employeedata.nextDouble();
        double hra=((10*basicsalary)/100);
        double da=((8*basicsalary)/100);
        double ta=((9*basicsalary)/100);
        double pf=((20*basicsalary)/100);
        double Grosssalary=(hra+da+ta-pf);
        System.out.println("HRA="+hra);
        System.out.println("DA="+da);
        System.out.println("TA ="+ta);
        System.out.println("Gross salary ="+Grosssalary);
        System.out.println(" ________________________________________");
        System.out.println("|         Salary Slip                    |");
        System.out.println("|________________________________________|");
        System.out.println("|         Employee Id :"+ employeeid+"                 |");
        System.out.println("|         Employee Name :"+employeename+"             |");
        System.out.println("|                                        |");
        System.out.println("|________________________________________|");
        System.out.println("|----------------------------------------|");
        System.out.println("|  Basic salary: "+ basicsalary+"                 |");
        System.out.println("|  HRA  : "+ hra+"                         |");
        System.out.println("|  DA: "+ da+"                            |");
        System.out.println("|  PF: "+ pf+"                            |");
        System.out.println("|----------------------------------------|");
        System.out.println("|    Gross Salary  : "+Grosssalary+"         " + "     |");
        System.out.println("+========================================+" + "");



    }
}
