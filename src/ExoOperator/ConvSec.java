package ExoOperator;

import java.util.Scanner;
public class ConvSec {

    public static void main (String args[])
    {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Entrez des secondes");
        int sec;
        sec = lectureClavier.nextInt() ;
        int hours = sec / 3600;
        int remainder = sec - hours * 3600;
        int mins = remainder / 60;
        remainder = remainder - mins * 60;
        int secs = remainder;
        System.out.println(hours + ":" + mins + ":" + secs);
    }
}
