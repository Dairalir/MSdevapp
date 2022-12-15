package Cours.Fonctions;

import java.io.*;

public class Fonctions {

    public static void main (String[] args)
    {
        double dPar = 12.0 ;
        double dCarre;
        dCarre = calculeCarre(dPar) ;
        System.out.println(dCarre) ;
    }

    public static double calculeCarre(double dd)
    {
        double result ;
        result = dd*dd ;
        return result ;
    }
}
