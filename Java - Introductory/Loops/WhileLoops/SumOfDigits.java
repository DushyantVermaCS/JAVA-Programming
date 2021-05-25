//Find sum of digits that is entered by user ----

package Loops.WhileLoops;

import java.util.Scanner;
public class SumOfDigits {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number -: ");
        int num = sc.nextInt();
        int tnum = num;
        int sum = 0;
        sc.close();
        while(tnum > 0){
            int rem = tnum  % 10;
            tnum /= 10;
            sum += rem;
        }
        System.out.print("The sum of digit "+ num +" is :- " + sum);
        System.out.println();
        
//Note ------------------------------------------------------------------
        //To get number of digits entered by user we use a formula...

        int numberOfDigits = (int)Math.log10(num) + 1;

        System.out.println("The number of digits entered by user is : " + numberOfDigits);
    }
}
