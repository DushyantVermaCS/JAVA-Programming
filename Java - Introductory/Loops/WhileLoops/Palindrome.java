package Loops.WhileLoops;
//Check Whether given number is palindrome or not...

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ") ;
        int num = sc.nextInt();
        int temp = num;
        sc.close();
        int reverseNum = 0;
        while(temp > 0){
            int rem = temp % 10;
            temp /= 10;
            reverseNum = reverseNum * 10 + rem;
        }
        if(reverseNum == num){
            System.out.println("Given number is Palindrome.");
        }
        else{
            System.out.println("Chal Bhaag!...");
        } 
    }
}
