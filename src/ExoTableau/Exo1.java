package ExoTableau;

import java.util.Arrays;
import java.util.Scanner;

public class Exo1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int tab[];
        System.out.println("entrez la taille du tableau");
        tab = new int [sc.nextInt()];
        System.out.println("entrez les valeurs du tableau");

        for(int i = 0; i < tab.length; i++) {
            tab[i] = sc.nextInt();
        }
        System.out.println("Les element du tableau sont "+ Arrays.toString(tab));
    }
}
