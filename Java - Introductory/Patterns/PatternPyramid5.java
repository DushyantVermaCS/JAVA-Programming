//Print a Pyramid of Patterns like -      *      by taking size by user ---
//                                      *   *    
//                                    *   *   * 

package Patterns;

import java.util.Scanner;
public class PatternPyramid5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of Pattern - ");
        int size = sc.nextInt();
        sc.close();
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size-i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(" *  ");
            }
            System.out.println();
        }
    }
}
