
package javaprogram;

public class Question14 {
    public static void main(String[] args) {
        numerdivisibilitycheck();
    }

    public static void numerdivisibilitycheck() {
        System.out.println("Numbers divisible by 3= ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }


        }
        System.out.println("Numbers divisible by 5= ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }


    }
}

