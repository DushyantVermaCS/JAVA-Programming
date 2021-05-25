//WAP to compute the natural logarithmic of 2 by adding up to n term
//in series: 1 - 1/2 + 1/3 - 1/4 + 1/5 -......1/n where n is a +ve integer.

package Loops;

import java.util.Scanner;
public class Q2sumSeries {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        float ans = 0;
        sc.close();  //as now we don't need any input from here so we close Scanner.
        for(float j = 1; j <= n; j++){
            if(j % 2 == 0){
                ans -= 1/j;
            }
            else{   //here we also can simply use 'else'...
                ans += 1/j;
            }
        }
        System.out.println("Ans = " + ans);
    }
}