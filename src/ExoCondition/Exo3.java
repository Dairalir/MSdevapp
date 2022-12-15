package ExoCondition;

import java.util.Scanner;

public class Exo3 {
    public static void main (String args[]){
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Saisir un nombre entier");
        float Y = lectureClavier.nextInt();
        System.out.println("Saisir un opérateur");
        String Ope = lectureClavier.next();
        System.out.println("Saisir un second nombre entier");
        float X = lectureClavier.nextInt();
/*
        if (Ope.equals("+")){
            float Result = Y + X;
            System.out.println(Result);
        } else if (Ope.equals("-")) {
            float Result = Y - X;
            System.out.println(Result);
        } else if (Ope.equals("*")) {
            float Result = Y * X;
            System.out.println(Result);
        } else if (Ope.equals("/")){
            float Result = Y / X;
            System.out.println(Result);
        } else {
            System.out.println("Opérateur erroné");
        }*/

        switch (Ope){
            case "+":
                float Somme = Y + X;
                System.out.println(Somme);
                break;
            case "-":
                float Difference = Y - X;
                System.out.println(Difference);
                break;
            case "*":
                float Produit = Y * X;
                System.out.println(Produit);
                break;
            case "/":
                float Quotient = Y / X;
                System.out.println(Quotient);
                break;
            default:
                System.out.println("Opérateur erroné");
        }
    }
}
