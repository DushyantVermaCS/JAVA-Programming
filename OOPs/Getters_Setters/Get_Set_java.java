//Let's take a look at getters and setters in java: - These are used to retrieving and updating values of variable outside the "Encapsulated" class.

package OOPs.Getters_Setters;


class Employee{    //this is encapsulated class
    private int id;
    private String name;

    public int getId(){  //getter return the id of employee class
        return id;
    }
    public void setId(int id){  //set the id of employee
        this.id = id;
    }

    public String getName(){ //getter to return the name of employee
        return name;
    }
    public void setName(String name){  // setter to set the value of Name in employee class.
        this.name = name;
    }
}

public class Get_Set_java {
    public static void main(String[] args) {
        Employee obj = new Employee();  //Object of class employee
        obj.setName("Dheeraj");  //setting the name of employee
        obj.setId(12);  //setting the id

        System.out.println("Employee name is " + obj.getName() + " and id is " + obj.getId());
    }
}
