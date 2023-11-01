package javaprogram;/*Write a Java program to sort a numeric array and a string array.*/

import java.util.Arrays;

public class Question20 {
    public static void main(String[] args) {
        int[] numericarray = {3, 89, 90, 67, 98};
        String[] stringarray = {"jamshedpur", "Delhi", "Jaipur", "Bombay"};
        System.out.println(Arrays.toString(numericarray));
        Arrays.sort(numericarray);
        System.out.println("sorted numeric array : "+Arrays.toString(numericarray));
        System.out.println(Arrays.toString(stringarray));
        Arrays.sort(stringarray);
        System.out.println("sorted string array : "+Arrays.toString(stringarray));

    }

}
