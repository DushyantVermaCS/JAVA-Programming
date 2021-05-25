//print pattern (b)-  * * * and take size of pattern by user ---   
//                      * *
//                        *


package Patterns;

import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.close();

        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size-i+1; j++){
                System.out.print("* ");
            }
            for(int k = 0; k <= i-1; k++){
                System.out.print("  ");
            }

            System.out.println();
        }
    }
    
}
