package Operators;

import java.util.Scanner;
public class comparisionOp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int var1 = sc.nextInt();
        int var2 = sc.nextInt();
        int a = 1;

        //Comparison Operators
        boolean lse = var1 <= var2; 
        boolean gre = var1 >= var2; //Greater than and equals to
        boolean eq = var1 == var2;  //Comparisonn operator (==)
        boolean neq = var1 != var2; //not equals to operator

        //ASSIGMnEMT OPERator-----------------

        a += var1;
        a <<= var2;
        a >>= var1;
        a %= var2;


        System.out.println(lse);
        System.out.println(gre);
        System.out.println(eq);
        System.out.println(neq);
        System.out.println(a);
        System.out.println(a);

    }
    
}
