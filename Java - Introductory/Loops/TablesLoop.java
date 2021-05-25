//------Print Multiplication Table from 1 to 20.--------------------------- 

package Loops;

public class TablesLoop {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 11; i++){
            //System.out.println("  ");
            for(int j = 1; j <= 20; j++){
                int num = i * j;
                System.out.print("   |" + num + "|  ");
            }
            System.out.println(); //for next line
        }
    }
}
