package ExoOperator;

import java.util.Scanner;

public class ASCII {
    public static void main (String args[])
    {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Saisir un code Unicode");
        int unicode = lectureClavier.nextInt();
        char convertedChar = (char)unicode;
        System.out.println(convertedChar);
    }
}
