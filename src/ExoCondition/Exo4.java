package ExoCondition;

public class Exo4 {
    public static void voyelles(){
        int nombredeligne = 4;

        for (int k = 0; k <= nombredeligne; k++)
        {
            for (int j = 0; j < nombredeligne-k; j++)
                System.out.print(" ");
            for (int i = 0; i < (k*2+1); i++)
                System.out.print("*");
            System.out.println("");
        }
    }
}
