//Makeing a basic calculator using switch - case statements:------ 

package ConditionalStatements;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first num- ");
        float num1 = sc.nextFloat();

        System.out.println("Enter second num.- ");
        float num2 = sc.nextFloat();

        System.out.println("Enter the operator for calculation- ");
        sc.nextLine();  //taking string input 1st time 
        
        char operation = sc.nextLine().charAt(0);  //Taking string input 2nd time
        //Above we take string and consider it's first character --('Which is at index zero(0)')-- as our operation.

        switch(operation){
            case '+':
                System.out.println("Adding the Numbers = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtracting = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplying = " + (num1 * num2));
                break;
            case '/':
                System.out.println("Dividing = " + (num1 / num2));
                break;
            case '%':
                System.out.println("Remainder = " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid Operation...");

        }

    }
}
