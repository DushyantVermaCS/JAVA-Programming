package OOPs.Consturctor;

class Vehicle{
    int wheels;
    int headLights;
    String color;
//---------------Non - Parameterized Constructor---------
//    Vehicle(){   //This is like a default constructor.
//        wheels = 4;
//    }

    //----------------Parameterized Constructor-----------------------------------
//    Vehicle(int noOfWheels){
//        wheels = noOfWheels;
//        int headLights = 2;
//    }

    Vehicle(int wheels){
        this.wheels = wheels;  //here this reference the current object.
        headLights = 2;
    }
}

public class MyConstructor {
    MyConstructor(){    //<- constructor created..
        System.out.println("object is now created");
    }
    public static void main(String[] args) {
        //MyConstructor obj = new MyConstructor();   //-> Here we create object of my constructor.
        //only for understand --> in above line new MyConstructor() is like calling MyConstructor. Literally meaning is different.

        Vehicle car = new Vehicle(4);
        Vehicle scooter = new Vehicle(2);
        System.out.println(car.wheels + " Car Wheels" + " Scooty Wheels "+ scooter.wheels);
    }
}
