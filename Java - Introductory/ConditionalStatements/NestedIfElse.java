package ConditionalStatements;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int result = 0;
        
        //Using nested if else-------------(finding max number.)---

    /*    if(num1 > num2){    //Condition 1
            if(num1 > num3){   //Condition 2
                result = num1; //When both conditions (1 & 2) are true..
            }
            else{
                result = num3;
            }
        }
        else{
            if(num2 > num1){
                if(num2 > num3){
                    result = num2;
                }
                else{
                    result = num3;
                }
            }
        }
        System.out.println("Greatest Number = " + result); */

        //Doing same Code by using ShortHand or Ternary Operator----

        result = num1 > num2 ? num1 > num3 ? num1 : num3 : num2 > num3 ? num2 : num3;  

        System.out.println("Greatest Number = " + result);
    }
}
