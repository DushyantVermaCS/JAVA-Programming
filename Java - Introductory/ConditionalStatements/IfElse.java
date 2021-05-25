//The flower petals love game--------------------

package ConditionalStatements;

import java.util.Scanner;
public class IfElse {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int noOfPetals = sc.nextInt();

        if(noOfPetals % 2 == 0){
            System.out.println("Loves me");
        }
        else{
            System.out.println("Loves me Not");
        }
    }

}
