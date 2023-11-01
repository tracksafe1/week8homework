package midweek;
/*Take input of age of 3 people by user and determine oldest and youngest among
them.*/

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Q07 t=new Q07();
        t.oldestyoungest();
    }
    public void oldestyoungest(){
        Scanner Oldestyoungest=new Scanner(System.in);
        System.out.println("Enter value of first person :");
        int firstperson=Oldestyoungest.nextInt();
        System.out.println("Enter value of Second person :");
        int secondperson=Oldestyoungest.nextInt();
        System.out.println("Enter value of Third person :");
        int thirdperson=Oldestyoungest.nextInt();
        if(firstperson>secondperson&&firstperson>thirdperson){
            System.out.println("greatest is First person"+firstperson);
        }else if(secondperson>thirdperson&&secondperson>firstperson){
            System.out.println("Greatest is second no :"+secondperson);
        }else{
            System.out.println("Greatest is Third person :"+thirdperson);
        }
    }
}
