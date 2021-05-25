//Some Methods/Functions used in Strings are-------------->

package String;

public class StringFunctions {
    
    public static void main(String[] args) {
        String name = "Dushyant";   //String always store in Double quotes (" ")
        name = name + " Verma";
        String name1 = "Let's Look at Java basics";

        String cars = "Lamborghini, BMW, McLaren, Land Rover, Audi, Mercediz";
        String[] allCars = cars.split(","); //It will split according to the given element inside parenthesis.
        //charAt Method
        System.out.println("Character at particular index : " + name.charAt(2));
        
        //length() Method
        System.out.println("Lenght is : " + name.length());

        //substing (beginIndex) Method    --> Return the string from given index beginning.
        System.out.println("Return Substirng : " + name.substring(5));

        //substring (beginIndex, endIndex) Method  --> Return string from begin index to end index.
        System.out.println(name.substring(3, 7));

        //contains(CharSequence s) function
        System.out.println("Contains : " + name.contains("Verma"));

        //equals() function 
        System.out.println("Equals Check : " + name.equals(name1));

        //isEmpty Function
        System.out.println("Check for Empty : "+name.isEmpty());
        
        //concat(str) function
        System.out.println("Let's Concat: " + name.concat(name1));

        //replace(char old, char new) func.
        System.out.println("Replace : " + name1.replace('b', 'B'));  //Characters always taken in single quotes (' ')

        //String[] split(String regex) func
        System.out.println("Split :----- ");
        for(String car: allCars){
            System.out.println(car);
        }

        //indexOF(int ch) fun.
        System.out.println("Index of :- " + name.indexOf('M'));  //if M is not present in String of 'name' variable then it will return -1.

        //toLowerCase() fun.--------
        System.out.println("Lower Case :- " + cars.toLowerCase());

        //toUpperCase() func. -------
        System.out.println("Upper Case :- " + cars.toUpperCase());

        //trim() function
        System.out.println("Trim :- " + name1.trim()); // Removes all the spaces
    }
}


//There are many more Functions availabe on ORACLE docs. go and keep learning....