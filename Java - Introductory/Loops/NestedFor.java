//Print 1 to 10 - five times using loop---

package Loops;

public class NestedFor {
    
    public static void main(String[] args) {
        for(int j = 1; j <=5; j++){    
            for(int i = 1; i <= 10; i++){
                System.out.print(i + " " );
            }
            System.out.println();  //It will automatically create a new line.
        }
    }
}
