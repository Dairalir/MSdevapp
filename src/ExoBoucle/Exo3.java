package ExoBoucle;

import java.util.Scanner;

public class Exo3 {
    public static void main (String args[]){
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Saisissez un nombre");
        int n1 = lectureClavier.nextInt();
        System.out.println("Saisissez un nombre");
        int n2 = lectureClavier.nextInt();
        int somme = 0;

        while (n1 < n2){
            n1++;
            somme = somme + n1;
        }
        System.out.println(somme);
    }
}
