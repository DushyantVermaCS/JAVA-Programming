package Loops;

import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number:- ");
        int num = sc.nextInt();
        System.out.print("Enter the power:- ");
        int pow = sc.nextInt();
        int var = num;

        for(int i = 0; i < pow - 1; i++){
            num *= var;

        }
        System.out.println("Ans = " + num);
    }
}
