//take 2 matrices and add them, then print the result in 3rd matrix.

package Arrays.MultiDimensionalArray;

import java.util.Scanner;
public class Matrix {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Dimensions :");
        System.out.print("Enter Rows -:");
        int rows = sc.nextInt();
        System.out.print("Enter Columns -: ");
        int cols = sc.nextInt();

//For addition dimensions of both matrices munst be same (according to a rule of matrix).
        int [] [] a = new int [rows] [cols];
        int [] [] b = new int [rows] [cols];

//Lets intput the val. in matrices-------

//for matric a ------------
    System.out.println("Eneter Array a :- ");
    for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols; j++){
            a [i] [j] = sc.nextInt();
        }
    }
//for matrix b ------------
System.out.println("Eneter Array b :- ");
    for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols; j++){
            b [i] [j] = sc.nextInt();
        }
    }
    sc.close();
    //Now let's make a 3rd matrix to store the result of additon of matrix a and b.
    int c [] [] = new int[rows] [cols];

    for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols; j++){
            c[i] [j] = a[i] [j] + b [i] [j];
        }
    }
    System.out.println("Resultant Matrix(Array) is :- ");
    for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols; j++){
            System.out.print(c[i] [j] + " ");
        }
        System.out.println();
    }

   } 
}
