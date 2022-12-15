package ExoOperator;

public class Moyenne {
    public static void main (String args[])
    {
        int A = 15 , B = 12 , C = 16 , coefA = 3, coefB = 2 , coefC = 1;
        A = A * coefA ;
        B = B * coefB ;
        C = C * coefC ;
        int M = (A + B + C)/(coefA + coefB + coefC) ;
        System.out.println(M);
    }
}
