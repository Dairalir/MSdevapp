package ExoCondition;

import java.util.Scanner;

public class Exo1 {
    public static void main (String args[])
    {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        int N = lectureClavier.nextInt();

        if (N % 2 == 0) {
            System.out.println("le nombre est pair");
        } else {
            System.out.println("le nombre est impair");
        }
    }
}
