package Operators;

import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(!(number >= 1 && number <= 100)){  //using NOT Operator
            System.out.println("Invalid Number");
        }
        else{
            System.out.println("Number is b/w 1 to 100");
        }
    }
    
}
