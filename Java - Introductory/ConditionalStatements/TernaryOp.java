package ConditionalStatements;

import java.util.Scanner;
public class TernaryOp {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        System.out.println("Given Value is " + value);
        
    //Using ShortHand If Else -(or)- Ternary OPerator...

        String state = (value > 10) ? "This is 2 or more digit num." : "This is less than 2 digit value";
        
        System.out.println(state);
    }
}
