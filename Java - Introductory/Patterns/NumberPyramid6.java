//Print pattern of numbers like-        1        where size of numbers given by user.
//                                    2   3   
//                                  4   5   6
//                                7   8   9   10 

package Patterns;

import java.util.Scanner;

public class NumberPyramid6 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of Pattern - ");
        int size = sc.nextInt();
        sc.close();
        int num = 0; 
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                //num += 1;     OR
                System.out.print(" " + ++num + "  ");  //here ++num increases the number.
            }
            System.out.println();
        }
    }
}
