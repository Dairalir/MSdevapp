package ExoTableau;

import java.util.*;

public class Exo2 {

/*
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] tab = {"Audrey", "Aurélien", "Flavien", "Jérémy", "Laurent", "Melik", "Nouara", "Salem", "Samuel", "Stéphane"};
        System.out.println("Saisir un prénom");
        String name = sc.next();
        tab = removeElement(tab, name);
        tab[8] = " ";
        System.out.println(Arrays.toString(tab));
    }
    public static String[] removeElement(String[] arr, String name) {
        return Arrays.stream(arr)
                .filter(s -> !s.equals(name))
                .toArray(String[]::new);
    }

 */

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] tab = {"Audrey", "Aurélien", "Flavien", "Jérémy", "Laurent", "Melik", "Nouara", "Salem", "Samuel", "Stéphane"};
        List<String> list = new ArrayList<String>(Arrays.asList(tab));
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


}

