//Understand PAssByValue nature of JAVA using swapping by method..
package OOPs.Methods;

public class PassByValue {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter 1st val : ");
//        int val = sc.nextInt();
//        System.out.print("Enter 2nd val : ");
//        int num = sc.nextInt();
//        System.out.println("Before Swapping : " + val +" "+ num);
//        swap(val, num);
//        sc.close();

//        Dog c = new Dog();
//        c.legs = 3;
//        Dog d = new Dog();
//        d.legs = 4;
//        System.out.println(c.legs + " " + d.legs);
       Dog a = new Dog();
       a.legs = 4;
       changeDog(a);
        System.out.println(a.legs);
    }

//(2)-----------------in case of non-primitive reference of object is passed----------------------
    static void swap(Dog a, Dog b){
        Dog temp = a;
        a = b;
        b = temp;
    }
    static void changeDog(Dog dog){
        dog.legs = 6;
    }

//---------------This (below) is like litmus test which tell about passByValue or PassByReference------------------------
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : " + a + " " + b);
    }
}
//(1)--------------Let's try with non-primitive datatype------------------------
class Dog{
    int legs;
}