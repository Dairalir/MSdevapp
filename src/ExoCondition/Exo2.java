package ExoCondition;

import java.util.Scanner;

public class Exo2 {
    public static void main (String args[]){

        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Saisir votre année de naissance");
        int Y = lectureClavier.nextInt();
        int age = 2022-Y ;

        if ( age >= 18) {
        System.out.println("Votre age est de : " + age + " et vous êtes majeur.");
        } else {
            System.out.println("Votre age est de : " + age + " et vous êtes mineur.");
        }
    }
}
