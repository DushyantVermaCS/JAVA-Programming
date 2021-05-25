import java.util.Scanner;
public class simpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int principal = sc.nextInt();
        float rate = sc.nextFloat();
        int time = sc.nextInt();

        sc.close();
        System.out.println((principal * rate * time) / 100);
    }

    
}
