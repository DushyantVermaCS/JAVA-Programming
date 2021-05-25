//Make Pattern like *       by takng size from user ---
//                  * *   
//                  * * * 
//                  * * * *
//                  * * *
//                  * *
//                  *

package Patterns;

import java.util.Scanner;
public class PatternStar7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size = ");
        int size = sc.nextInt();
        int rows = 2 * size - 1;    //here by above pattern after '4th' row ,size of pattern decreases so,
        //for size input 4 we need 7 rows - i.e. given my making a logic -->  2 * size - 1.   
        sc.close();
        for(int i = 1; i <= rows; i++){
            if(i <= size){
                for(int j = 1; j <= i; j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j = 1; j <= rows-i+1; j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    
}
