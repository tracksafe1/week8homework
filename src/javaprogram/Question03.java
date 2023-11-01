package javaprogram;

/*Declare multidimensional array and store 5 countries and their capital and print them in
console.*/
public class Question03 {
    public static void main(String[] args) {
        String [][] countrieswithcapitals={{"India","NewDelhi"},
                                          {"Denmark","Copenhagen"},
                                           {"France","Paris"},
                                           {"Germany","Berlin"},
                                           {"Ireland","Dublin"}};
        for(int i=0; i<=countrieswithcapitals.length-1;i++){
            String countries=countrieswithcapitals[i][0];
            String capitals=countrieswithcapitals[i][1];
            System.out.println("country name:" +countries+" , capital name : "+capitals);}}
        }



