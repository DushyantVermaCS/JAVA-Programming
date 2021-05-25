package ConditionalStatements;

import java.util.Scanner;

import java.util.Scanner;
public class elseIfCondititon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number >= 10 && number <= 100){
            System.out.println("No. is under 10 to 100");
        }
        else if(number <=9){
            System.out.println("Nomber is less than 10");
        }
        else{
            System.out.println("Out of Range...");
        }


    }
}
