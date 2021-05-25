//2D Array --> Decleration , Accessing Values in 2d Array

package Arrays.MultiDimensionalArray;

public class TwoDArray {
    public static void main(String[] args) {
//Mulidimensional array logic start's from here ...

        //int [] [] arr = new int[4] [3];  //Decleration of 2D array (of 4 raw and 3 columns)----

        //System.out.println(arr[1][2]); //Accessing the cell (accessing 2nd raw , 3rd column value)-----


        /*initilizating values in 2D array --------------------------------------*/
        int [] [] bunch = {
                        {1,3,5,6,7,3},   //Consider as 1st raw.
                        {3,2,5,7},      //Consider as 2nd raw.
                        {4,5,7,2,9,6}   //Consider as 3rd raw.
                    };
        System.out.println(bunch [1][2]);  //print value that is on 2nd raw and 3rd column.
    }
}
