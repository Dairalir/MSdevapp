package UI;

import tool.*;

import java.util.Scanner;

public class Menu {
    public static void init() {
        Scanner sc = new Scanner(System.in);
        String ret;
        boolean encore = true;
        do {
            System.out.println("==============================================");
            System.out.println("|| Choisissez un exo (1 ou 2) 0 pour quitter ||");
            System.out.println("|| 1: les voyelles                           ||");
            System.out.println("|| 2: les triangles                          ||");
            System.out.println("|| 3: les tableaux                           ||");
            System.out.println("|| 4: les tableaux listes                    ||");
            System.out.println("|| 5: les conversion                         ||");
            System.out.println("|| 0: quitter                                ||");
            System.out.println("==============================================");

            ret = sc.nextLine();

                switch (ret) {
                    case "1":
                        ExoMenu.voyelles();
                        break;
                    case "2":
                        ExoMenu.triangle();
                        break;
                    case "3":
                        ExoMenu.tableau();
                        break;
                    case "4":
                        ExoMenu.tableauList();
                        break;
                    case "5":
                        ExoMenu.convSec();
                        break;
                    case "0":
                        System.out.println("===========================================");
                        System.out.println("|            Merci et à bientôt           |");
                        System.out.println("===========================================");
                        encore= false;
                        break;
                    default:
                        System.out.println("entrez une valeur correct");
                        break;
                }
        } while (encore);
    }
}
