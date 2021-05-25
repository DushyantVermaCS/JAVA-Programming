//Don't print number b/w (between) 40 to 50 in a loop of 100...

package Loops;

public class Continue {
    
    public static void main(String[] args) {
        for(int k = 1; k <= 100; k++){
            if(k >= 40 && k <= 50){
                continue;
            }
            System.out.println(k);
        }
    }
}
