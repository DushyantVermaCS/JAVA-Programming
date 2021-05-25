//Take input from user for multiplication of table print the table  --------------

package Loops;

import java.util.Scanner;
public class TableByUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Want Table from - ");
        int val = sc.nextInt();
        System.out.print("Want table to - ");
        int num = sc.nextInt();
        sc.close();
        //------------------Logic Time-------------------
        
        for(int i = 1; i <= 10; i++){
            System.out.println("  ");
            for(int j = val; j <= num; j++){
                int table = j * i;
                System.out.print("   |" + table + "|  ");
            }
            System.out.println(); //for next line
        }
    }
}

