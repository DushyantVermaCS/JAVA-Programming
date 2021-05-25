//Print pattern like (a)-*       by taking input size from user ---
//                       * *
//                       * * *

package Patterns;

import java.util.Scanner;
public class patternStar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What size of Pattern you want - ");
        int size = sc.nextInt();
        sc.close();
        for(int j = 1; j <= size; j++){
            for(int k = 1; k <= j; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
