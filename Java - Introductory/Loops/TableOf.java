package Loops;
import java.util.Scanner;
public class TableOf {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Want table of -: "); //print will take input in same line..
    int digit = sc.nextInt();
    
    for(int i = 1; i <= 10; i++){
        // int number = digit * i; 
        // System.out.println(number); //println means print in next line..
//OR
        System.out.println(digit * i);
    }
}
    
}


/*----------------------Note:- if i give for loop as--------------------------------------------

    for( ; ; ){
        System.out.println("Hello Java");
    }

==> the above for loop will run infinite times and will print 'Hellow Java' infinite times */