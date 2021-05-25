//Take input number of students and their marks then find average of Marks.

package Arrays;

import java.util.Scanner;
public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Give Number of Students :- ");
        int numStuds = sc.nextInt();
        int[] marks = new int[numStuds];

        //int[] studMarks = new int[]

        for(int i = 0; i < numStuds; i++){
            marks[i] = sc.nextInt();
        }
        sc.close();
        int averageMarks = 0;
        for(int j = 0; j < numStuds; j++){
            averageMarks = (averageMarks + marks[j]);
        }
        System.out.println("Average Marks = " + (averageMarks / numStuds));
    }
}
