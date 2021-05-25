package Operators;

import java.util.Scanner;

public class arithmeticOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        float var = sc.nextFloat();
        int s = (int) ((var + num) * (num + var)); //Multi & Add

        double div = (double)num / (double)s; //Divide
        int mod = (int) (div % (s)); //Modulo ,... here we use type casting as converting double value in Integer type...

        int i = ++num;  //Increment Operator , OR we can write it as
        
       // i = num++;


        int d = (int)--var; //Decrement Operator

        System.out.println("Whole Square " + (num * num  + var * var + 2 * var * num));
        System.out.println("int Sum "+s);
        System.out.println("Divide "+div);
        System.out.println("Modulo "+mod);
        System.out.println("Increment "+i);
        System.out.println("Decrement "+d);
    }
} 
