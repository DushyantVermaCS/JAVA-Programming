package Arrays;

public class ArrayIntro{
    public static void main(String[] args) {

//---------------------------Array Initilization-----------------------------------
        //int [] marks = new int[5];    //Array of size 5 is decleared

        //OR 

        // int[] marks;
        // marks = new int[7];    //we create/decleare a array of size 7.

        //System.out.println(marks[2]);   //it will print the marks that is at index 2.
//----------------------------Storing Data in Array---------------------------------
       
        int age[] = {10,20,49,73};
        // double[] marks = {1.0,2.5,6.9,8.6};
        // marks[2] = 9.28;  // --->Changing or Updating value of index 2 in marks Array----
        // System.out.println(marks[2]);

//-------------------Using Loops----------------------------------------------------
//to Print data of age Array-->

        for(int i = 0; i < age.length ; i++){    //here by using .length firld we determine length of array age.
            System.out.println(age[i]);
        }

    }
}