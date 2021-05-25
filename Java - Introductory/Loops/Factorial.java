package Loops;

//Simple progtam to find factorial (this program is not too good)

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find factorial -: ");
        int number = sc.nextInt();
        int value = 1;
        for(int i = number; i >= 1; i--){
            value*=i;
        }
        System.out.println("The Factorial of " + number + " is -: " + value);
    }
    
}
