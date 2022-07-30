package OOPs.Getters_Setters;

  /*
1. Create a class cylinder and use getter and setter to set its radius and height.
2. Use (1.---) to calculate surface area and volume of the cylinder
3. Use a constructor and repeat (1--)
4. Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.
     */


//Solving 1, 2.--------
class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {   //getter for radius
        return radius;
    }

    public void setRadius(int radius) {   //setter for radius
        this.radius = radius;
    }

    public int getHeight() {  //getter for height
        return height;
    }

    public void setHeight(int height) {  //setter for height
        this.height = height;
    }

    //3. -----------

    public Cylinder(int radius, int height) { // creating constructor for same operation
        this.radius = radius;
        this.height = height;
    }

}

//4.----- constructor overloading---
class Rectangle{
    private int length;
    private int breadth;

    public int getLength(){ // getter for return length
        return length;
    }

    public int getBreadth(){ //getter for return breadth
        return breadth;
    }

    public Rectangle(){  // constructor1
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth){  // Overloaded constructor2
        this.length = length;
        this.breadth = breadth;
    }
}

public class Getter_Setter_Practice {

    public static void main(String[] args) {

        //-----------------------------Cylinder class operations-----------------------------------------

//        Cylinder obj = new Cylinder(9,12); //creating object of Cylinder class so that we can access the getter & setter methods
//        //obj.setHeight(12);
//        System.out.println("Height :" + obj.getHeight());
//        //obj.setRadius(9);
//        System.out.println("Radius :" + obj.getRadius());
//        System.out.print("Volume of cylinder is : ");
//        System.out.println(Math.PI * obj.getRadius() * obj.getRadius() * obj.getHeight());  //Vol. of cylinder pi * r^2 * h
//        System.out.print("Area of Cylinder is : ");
//        System.out.println((2 * Math.PI * obj.getRadius() * obj.getHeight()) + 2*(Math.PI * obj.getRadius() * obj.getRadius()));  // Area of cylinder 2*PI*r*h + 2 * PI * r^2

        //Rectangle class operations----------------------------------------------------
        Rectangle r = new Rectangle(4,5);
        System.out.println("Length of rectangle : "+r.getLength());
        System.out.println("Breadth of rectangle : " + r.getBreadth());



    }

}
