package javaprogram;/*Write a Java program to sum values of an array.
*/
public class Question21 {
    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
        int [] numbers={22,34,12,34};
        int sum1=0;
        for(int i=0;i<=numbers.length-1;i++){
            sum1 +=numbers[i];
        }
        System.out.println("sum of array="+sum1);
    }
}

