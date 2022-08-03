// Suppose we want to check which number is greater than Use method to implement the code...

package OOPs.Methods;

public class Methods_Intro {
    public static void main(String[] args) {
        int firstNum = 18;
        int secondNum = 20;
        int result = maxOf(firstNum,secondNum);  //Calling 'maxOf' method.
        System.out.println(result);
        maxOf(5, 2.5f);   //calling method 'maxOf(int , float)'
        //sayHi();  //Calling 'sayHi' method
    }
    //----------------------------------------------------------------------------------------
    static int maxOf(int a, int b){    //in this method 'int' is used so it will return a value.
        //return a > b? a: b;
        //OR (above line of code and below code have same logic...
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }
    //---------------------------------------------------------------------------------------------
    //-> when a class have two or more method by same name but different parameters then it is called
    //"METHOD OVERLOADING".
    static float maxOf(int c, float d){
        if(c > d){
            return c;
        }else {
            return d;
        }
    }
    //-------------------------------------------------------------------------------------------------
//    static void sayHi(){  //this is the method with no parameters, and as this is void type so it will return nothing.
//        System.out.println("Hi");
//        System.out.println("Good Morning");
//    }
}
