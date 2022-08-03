package OOPs.Methods;
//We use method overriding in Inherited classes.

class first{   //Parent class

    public int dushyant(){
        return 6;
    }

    public void func(){       //function/method of super/parent class
        System.out.println("Hello i am a First class constructor");
    }
}

class second extends first{   //Child/Sub class
    public void func(){                        //overridden function from super class
        System.out.println("Hello i am a Second class constructor");  //with differ print statement.
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        first f = new first();  //Object of first class
        f.func();               //function call

        second s = new second();  //Object of second class
        s.func();               //function call
    }
}
