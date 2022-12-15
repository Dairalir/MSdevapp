package ExoOperator;

import java.util.Scanner;

public class Add {

    public static void main (String args[])
    {
        Scanner lectureClavier = new Scanner(System.in);
        int nX ;
        System.out.println("entrez un entier") ;
        nX = lectureClavier.nextInt() ;
        int nY ;
        System.out.println("entrez un second entier") ;
        nY = lectureClavier.nextInt() ;
        System.out.println(nX + nY) ;
    }
}
