//WAP to calculate the sum of the following series 
//where n is input by user. - 1 + 1/2 + 1/3 + 1/4 + ......1/n

package Loops;

import java.util.Scanner;
public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        float ans = 0;
        for(float j = 1; j <= n; j++){
            ans += 1/j;
        }
        sc.close();
        System.out.println("Series sum = " + ans);
    }
}
