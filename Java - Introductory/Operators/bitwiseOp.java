package Operators;

import java.util.Scanner;

public class bitwiseOp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();  //Suppose If i give value 3 i.e = 011
        int var = sc.nextInt(); //Suppose If i give value 5 i.e = 101

        int OR = num | var; //here 011 or 101 = 111 i.e 7

        int AND = num & var; // here 001 AND 101 = 001 i.e 1

        // 'Not' is also a bitwise Operator-----------;

        byte rs = (byte)(num >> 1); // Right Shift Operation -- 

        //in rs we shift bit value of num by one bit in left side as -> 011 will be 001
        byte ls = (byte)(var << 1); //Left Shift Operation --

        //in ls we shift bit value of var by one bit in left side as -> 101 will be like 010

        System.out.println("And "+AND);
        System.out.println("OR "+OR);
        System.out.println("Right Shift "+rs);
        System.out.println("Left Shift "+ls);
    

    }
    
}
