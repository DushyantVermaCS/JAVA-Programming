//Understand concept of Class and Object in java...

package OOPs;

//Cat class...
class Cat{
    boolean hasFur;     // 'States' of Cat.....
    String color, breed;
    int legs, eyes;
//defining method(function) for 'behavior' of Cat class...
    public void walk(){
        System.out.println("Cat is Walking");
    }
    public void eat(){
        System.out.println("Cat is eating");
    }
    public void description(){
        System.out.println("My cat has " + legs + " and " + eyes + " eyes");
    }
}
//Dog class...
class Dog{
    //below define States of dog class...
    String breed, name;
    int legs, eyes;
    //below define object of dog class...
    public void bark(){
        System.out.println(name + " from breed " + breed + " is Barking");
    }
    public void run(){
        System.out.println(name + " from breed " + breed + " is Running");
    }
}
//Main Class... (it is always public class)
public class MainClass {
    public static void main(String[] args) {
        //Creating Object for Cat class...

        Cat cat1 = new Cat();  //here cat1 is object name. and Cat is class
        Cat cat2 = new Cat();  //here cat2 is object name.

//        cat1.walk();          //Calling walk() method for cat1 object.
//        cat2.eat();           //Calling eat() method for cat2 object.
//        cat1.legs = 4;
//        cat1.eyes = 2;
//
//        cat2.legs = 4;     //giving value for legs state
//        cat2.eyes = 3;      //giving value for eyes state
//
//        cat1.description();
//        cat2.description();

        //Creating object for Dog class...

        Dog dog1 = new Dog(); //here dog1 is object. and Dog is class
        Dog dog2 = new Dog();
        dog1.breed = "Bug";
        dog1.name = "Scooby";

        dog2.breed = "Pitbull";
        dog2.name = "Dollar";
        dog1.bark();  //Calling bark method for dog1 object.
        dog2.run();   //Calling run method for dog2 object.
    }
}