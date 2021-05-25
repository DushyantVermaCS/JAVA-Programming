package ConditionalStatements;

import java.util.Scanner;

public class switchStatemets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayOfWeek = sc.nextInt();

        switch (dayOfWeek){
            case 1:
                System.out.println("Monday - On Work");
                break;
            case 2:
                System.out.println("Tuesday - Fun day");
                break;
            case 3:
                System.out.println("Wednesday - Happy Day");
                break;
            case 4:
                System.out.println("Thirsday - Run Day");
                break;
            case 5:
                System.out.println("Friday - Dry Day");
                break;
            case 6: case 7:      //  <--using same statements for 2 cases (case 6 & 7) ----
                System.out.println("Saturday - Weekend");
                break;
            // case 7:
            //     System.out.println("Sunday - FamTime");
            //     break;
            default:
                System.out.println("Invalid Day number...");
                break;

        }

    }
    
}
