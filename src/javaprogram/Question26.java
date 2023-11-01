package javaprogram;


public class Question26 {
    public static void main(String[] args) {

        reversename();
    }
    public static void reversename(){
        String name="Shikha";
        char[]reversename1=name.toCharArray();
        System.out.println(name);
        for(int i= reversename1.length-1;i>=0;i--){
            System.out.print(reversename1[i]);
    }
}}

