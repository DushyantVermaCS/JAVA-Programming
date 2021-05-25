//String is a non - primitive dataype used to store data...,
//String is a class.   and Stirngs are Immutable (non-changable)
package String;

public class StringIntro {
    public static void main(String[] args) {
        //  ---------------------------------------------  //
        
        String name = "Dushyant"; //Initilization by Literals.., (Store in String Pool Area (SPA) only)

        String name1 = new String("Dushyant"); 
        // Store in String Pool Area(if same string already not present in it) and in Heap Area also..
        
        String name2 = "Dushyant"; //
       // System.out.println(name == name1); 
       //This tells us string by literals and by new keyword are consider as different string. So it return FALSE.

        System.out.println(name == name2);  
        //This shows that (string) Dushyant is already in name variable so it take Dushyant string from SPA and show it for name2 also.
        //It measns Initilize string by literals give OPTMIZATION in code and better than using new object.


    }
}
