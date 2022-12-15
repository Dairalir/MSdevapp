package Cours.Controle;

import java.util.Scanner;

public class IfElse {
    public static void main (String args[]) {

        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        int nX = lectureClavier.nextInt();
        System.out.println("Saisir un second nombre");
        int dX = lectureClavier.nextInt();
        System.out.println("Saisir un troisieme nombre");
        int dY = lectureClavier.nextInt();

        if (nX % 2 == 0) {
            System.out.println("nX est pair");
        } else {
            System.out.println("nX est impair");
        }
        if (dX == dY) {
            System.out.println("dX est égal à dY");
        } else if (dX < dY) {
            System.out.println("dX est inférieur à dY");
        } else {
            System.out.println("dX est supérieur à dY");
        }
    }
}
