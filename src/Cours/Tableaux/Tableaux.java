package Cours.Tableaux;

public class Tableaux {
    public static void main (String args[]){
        int[] idEtudiant = new int[20];
        char[] cNiveaux = {'A', 'B', 'C', 'D', 'F'};
        double[][] dCoordonnées = {{0.0, 0.1}, {0.2, 0.3}};
        char premierElément = cNiveaux[0]; //premierElément = 'A'
        char cinquièmeElément = cNiveaux[4]; //cinquièmeElément = 'F'
        double ligne2Col1 = dCoordonnées[1][0]; //ligne2Col1 = 0.2


        int[] tableauInt = new int [5];
        int index;

        for (index = 0; index < 5; index++)
            tableauInt [index] = index;

        int[] tableauInt2;
        int nTaille;
        nTaille=7 ;
        tableauInt2 = new int [nTaille];
    }
}
