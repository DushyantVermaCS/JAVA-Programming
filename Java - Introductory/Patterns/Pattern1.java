//--Let's Print pattern box by taking size of patterns from user----

// where pattern is -  *  *  *   (it is of any size)
//                     *  *  * 
//                     *  *  * 

package Patterns;

import java.util.Scanner;
public class Pattern1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What size of Pattern box you want - ");
        int size = sc.nextInt();
        sc.close();
        for(int j = 1; j <= size; j++){
            for(int i = 1; i <= size; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
