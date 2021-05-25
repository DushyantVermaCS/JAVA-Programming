//Print pattern of stars - *           and take input by user.
                        // * *
                        // *   *
                        // *     *
                        // * * * * *

package Patterns;

import java.util.Scanner;
public class PatternStar8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size = ");
        int size = sc.nextInt();   
 //to solve we devide in two parts-----------       
        System.out.println("*");
        sc.close();

        for(int i = 2; i <= size-1; i++){
            System.out.print("* ");

            for(int j = 1; j <= i-2; j++){
                System.out.print("  ");
            }
            System.out.print("*");
            
            System.out.println();
        }   
//for 1st and last lines---------------------
        if(size > 1){
            for(int j = 1; j <= size; j++){
                System.out.print("* ");
            }
        }
    }
}
