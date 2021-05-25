//Print pattern like c): * * * *  and take input size by user----
//                         * * *
//                           * *
//                             *


package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What size of Pattern you want - ");
        int size = sc.nextInt();
        sc.close();

        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= i-1; j++){

        //here the spaces are print for 'i-1' times --

                System.out.print("  ");
            }
            for(int j = 1; j <= size-i+1; j++){ 
//----- here general formula for print stars is 'size - i + 1' --------

                //j is a local variable so its scope is lie under for present loop only.
                //in which 'j' is used ---

                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
