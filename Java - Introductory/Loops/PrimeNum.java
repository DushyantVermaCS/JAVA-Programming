//Check whether number is prime or not...
package Loops;

import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Give the number -: ");
        int num = sc.nextInt();
        boolean isPrime = true;
    
        for(int j = 2; j*j <= num; j++){
            if(num % j == 0) {
                isPrime = false;
            }
            break;
        }        
        if(num == 2)
            isPrime = true;
        else if(num < 2)
            isPrime = false;
        
        System.out.println("Number Prime = " + isPrime);
    }
    
}
