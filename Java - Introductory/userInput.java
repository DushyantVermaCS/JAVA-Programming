import java.util.Scanner;
public class userInput {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       
    //    int num = sc.nextInt();  //here it takes the input of integer value...

    //    double doNum = sc.nextDouble(); //it takes double value as input
       
       String hi = sc.nextLine(); 
       sc.close();
    //    System.out.println(num + 1);
    //    System.out.println(doNum);
       System.out.println(hi);
    }
    
}
