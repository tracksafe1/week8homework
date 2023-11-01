package midweek;/*Print multiplication table of 24, 50 and 29 using loop.*/

public class Q02 {
     static int num1=24;
    int num2=50;
    int num3=29;
    public static void main(String[] args) {
        Q02 t1 = new Q02();
        tables();
    }
    public static void tables(){
        Q02 t1 = new Q02();
        System.out.println("Table of 24");

        for(int i=1;i<=10;i++){
            System.out.println(num1 +"*"+i+"="+(num1*i));
        }
        System.out.println("Table of 50");
        for (int i=1;i<=10;i++){

            System.out.println(t1.num2 +"*"+i+"="+(t1.num2*i));
        } System.out.println("Table of 29");
        for (int i=1;i<=10;i++){

            System.out.println(t1.num3 +"*"+i+"="+(t1.num3*i));
        }
}}
