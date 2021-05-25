//Selection sort---------------->
package Sorting;

import java.util.Scanner;
public class SelectionSort{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array -:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        // ------------Selection Sort Logic-------------
        int len = arr.length;

        for(int i = 0; i < len-1; i++){

            int minIndex = i;
            for(int j = i; j < len; j++){
                if(arr[j] < minIndex){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
        for(int element: arr){
            System.out.print(element+" ");
        }
    }
}