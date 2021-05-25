//W.A.P to print fibonacci series for 'n' number input by user ...........

package Loops;

import java.util.Scanner;
public class FibonacciNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get Fibonacci series :- ");
        int number = sc.nextInt();
        
        int num1 = 0;
        int num2 = 1;

        System.out.print(num1+" ");
        System.out.print(num2+" ");
//as we take 2 number out of n numbers so we need n-2 numbers now----
        for(int i = 0; i < number - 2; i++){
            
            int num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;

        }
    }
}
