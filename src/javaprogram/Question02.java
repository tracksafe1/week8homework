package javaprogram;

public class Question02 {
    public static void main(String[] args) {
        countriesname();
    }
    public static void countriesname(){
        String[] countries={"India","Australia","london","Spain","Austria"};
        for (int i=0;i<=countries.length-1;i++){
            System.out.println(countries[i]);
        }
    }
}
