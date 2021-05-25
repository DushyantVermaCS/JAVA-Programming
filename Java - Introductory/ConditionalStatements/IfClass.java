package ConditionalStatements;

import java.util.Scanner;
public class IfClass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Eligible to give Vote");
    
        }
        else{
            System.out.println("Not Under 18");
        }
    }

    
}
