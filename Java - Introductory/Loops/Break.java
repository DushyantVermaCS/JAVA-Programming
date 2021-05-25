package Loops;

import java.util.Scanner;
public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//----------Take input from user until user type a negative number-------
        for(;;){
            int val = sc.nextInt();
            if(val < 0)
                break;
        }
        sc.close();

//-------------------------------------------------

//if we want to stop loop when 'i' reach to 45 then..
        // for(int i = 1; i <= 100; i++) {
        //     if(i == 45){
        //         break;
        //     }
        //     System.out.println(i);
        // }
    }
}
