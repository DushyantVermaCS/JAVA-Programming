//Bubble Sort ------------------->
package Sorting;

import java.util.Scanner;
public class BubblecSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array :- ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        int len = arr.length;

        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        //----------Logic of Bubble Sort-------------------------------//

        for(int i = 0; i < len-1; i++){

            boolean sorted = true;

             for(int j = 0; j < len-1-i; j++){
                 if(arr[j+1] < arr[j]){
                     int temp = arr[j + 1];
                     arr[j + 1] = arr[j];
                     arr[j] = temp;   

                     sorted = false;
                 }
             }
             if(sorted) break;
        }
        for(int item: arr){
            System.out.print(item + " ");
        }
    }    
}
