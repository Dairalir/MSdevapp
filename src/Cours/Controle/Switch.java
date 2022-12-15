package Cours.Controle;

import java.util.Scanner;

public class Switch {

    public static void main (String args[]) {
        char c = ' ';
        switch (c) {
            case '1':
            case '3':
            case '5':
            case '7':
            case '9':
                System.out.println("c est un chiffre impair");
                break;
            case '0':
            case '2':
            case '4':
            case '6':
            case '8':
                System.out.println("c est un chiffre pair");
                break;
            case ' ':
                System.out.println("c est un espace");
                break;
            default:
                System.out.println("ce n'est ni un chiffre ni un espace");
        }
    }

}
