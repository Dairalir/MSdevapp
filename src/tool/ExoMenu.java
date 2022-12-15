package tool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExoMenu {
    public static void triangle(){
        int nombredeligne;
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("|      Commençons par un triangle       |");
        System.out.println("=========================================");
        System.out.println("Quel taille?");
        nombredeligne = sc.nextInt();

        for (int k = 0; k <= nombredeligne; k++)
        {
            for (int j = 0; j < nombredeligne-k; j++)
                System.out.print(" ");
            for (int i = 0; i < (k*2+1); i++)
                System.out.print("*");
            System.out.println("");
        }
    }

    public static void voyelles(){
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("|      Je vais compter les voyelles       |");
        System.out.println("===========================================");
        System.out.println("Saisir un mot");
        String mot = lectureClavier.nextLine();
        int count = 0;

        for (int i = 0; i < mot.length(); i++){
            char c = mot.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y'){
                count++;
            }
        }
        System.out.println("le nombre de voyelles est de " + count);
    }

    public static void tableau(){
        Scanner sc = new Scanner(System.in);
        int tab[];

        System.out.println("===========================================");
        System.out.println("|        Je vais creer un tableau         |");
        System.out.println("===========================================");

        System.out.println("entrez la taille du tableau");
        tab = new int [sc.nextInt()];
        System.out.println("entrez les valeurs du tableau");

        for(int i = 0; i < tab.length; i++) {
            tab[i] = sc.nextInt();
        }
        System.out.println("Les element du tableau sont "+ Arrays.toString(tab));
    }

    public static void tableauList() {
        Scanner sc = new Scanner(System.in);
        String[] tab = {"Audrey", "Aurélien", "Flavien", "Jérémy", "Laurent", "Melik", "Nouara", "Salem", "Samuel", "Stéphane"};
        List<String> list = new ArrayList<String>(Arrays.asList(tab));

        System.out.println("===========================================");
        System.out.println("| Je vais supprimer un prénom du tableau  |");
        System.out.println("===========================================");

        System.out.println("Saisir un prénom");
        String name = sc.next();
        String space = " ";

        if( list.contains(name)){
            list.remove(name);
            list.add(space);
        }else{
            System.out.println("Le prénom n'est pas dans la liste.");
        }
        System.out.println(list);
    }

    public static void convSec() {
        Scanner lectureClavier = new Scanner(System.in);
        int sec;

        System.out.println("===========================================");
        System.out.println("|Je vais convertir des secondes en HH:MM:SS|");
        System.out.println("===========================================");

        System.out.println("Entrez des secondes");
        sec = lectureClavier.nextInt() ;
        int hours = sec / 3600;
        int remainder = sec - hours * 3600;
        int mins = remainder / 60;
        remainder = remainder - mins * 60;
        int secs = remainder;
        System.out.println(hours + ":" + mins + ":" + secs);
    }
}
