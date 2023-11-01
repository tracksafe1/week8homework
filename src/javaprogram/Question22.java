package javaprogram;/*Write a Java program to calculate the average value of array elements.*/

public class Question22 {
    public static void main(String[] args) {
   average();
    }
    public static void average(){
        int[] numbers={8,12,4,6,5};
        int sum=0;
        for(int i=0;i<=numbers.length-1;i++){
            sum +=numbers[i];}
        System.out.println(sum);
        int Average= sum/numbers.length;
        System.out.println("Average of an array = "+Average);

    }
}
