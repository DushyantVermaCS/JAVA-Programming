package OOPs.Consturctor;

class Vehicle1{
    int wheels;
    int headLights;
    String color;

    Vehicle1(){ //Default constructor.

    }

    Vehicle1(int wheels){   //overloaded constructor1
        this.wheels = wheels;
        headLights = 2;
    }

    Vehicle1(int wheels, String color){  // Overloaded constructor2
        this.wheels = wheels;  //here this reference the current object.
        this.color = color;
    }

}

public class ConstructorOverloading {
    ConstructorOverloading(){    //<- constructor created..
        System.out.println("object is now created");
    }
    public static void main(String[] args) {

        Vehicle1 car = new Vehicle1(4);
        Vehicle1 scooter = new Vehicle1(2);
        Vehicle1 eRickshaw = new Vehicle1(3, "Yellow");
        Vehicle1 random = new Vehicle1();
        System.out.println(car.wheels + " Car Wheels" + " and " +" Scooty have Wheels "+ scooter.wheels);
        System.out.println("eRickshaw have " + eRickshaw.wheels + " Wheels " +" color available " + eRickshaw.color + " " + random.wheels +" random vehicle");
    }
}
