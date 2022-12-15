package ExoCondition;

import java.util.Scanner;

public class Exo5 {
    public static void triangle(){
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("|      Je vais compter les voyelles |      ");
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
}
