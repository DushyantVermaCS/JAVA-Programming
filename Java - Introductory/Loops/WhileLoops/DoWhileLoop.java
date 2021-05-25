//Do While Loop runs the statement at least once 
//as it check the condition after entering in the loop.

package Loops.WhileLoops;

import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number-: ");
        int num = 1;
        do{
            num = sc.nextInt();

            System.out.println("Hello ROllNo.- " + num);
        }while(num != 0);
        sc.close();
    }
    
}
