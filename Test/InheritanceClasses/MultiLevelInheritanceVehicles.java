/*Write a Java program to demonstrate multilevel inheritance using the classes
1. Vehicle
2. Car, and
3. SportsCar
1. The Vehicle class should have three instance variables: String make, String model, and int year, and three methods: setMake(), setModel(), and setYear) to set the
values of these variables, and a display) method to display these values.
2. The Car class should inherit from Vehicle and have one additional instance variable: int numOfDoors, and one additional method: setNumOfDoors) to set the
value of this variable, and a display) method to display all of the instance variables.
3. The SportsCar class should inherit from Car and have one additional instance variable: String type, and one additional method: setType() to set the value of this
variable, and a display) method to display all of the instance variables.
Create an object of the SportsCar class and accept values from the user and set its instance variables using the respective setter methods. Finally, call the display)
method to display all of the instance variables.
Order of input will be 1. Make, 2. Model, 3. Year, 4. No of Doors, 5. Type
---------Sample input---------
Lamborghini
Gallardo
2019
2
Racing
---------Sample Output-----------
Make: Lamborghini
Model: Gallardo
Year: 2019
Number of doors: 2
Type: Racing
*/
package Test.InheritanceClasses;
import java.util.Scanner;
public class MultiLevelInheritanceVehicles {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // public static final Scanner sc = new Scanner(System.in);
        SportsCar obj = new SportsCar();
        obj.setMake();
        obj.setModel();
        obj.setYear();
        obj.setNumOfDoors();
        obj.setType();
        obj.display();
    }
}
class Vehicle{
    String make, model;
    int year;
    public void setMake(){
        make = MultiLevelInheritanceVehicles.sc.next();
    }
    public void setModel(){
        model = MultiLevelInheritanceVehicles.sc.next();
    }
    public void setYear(){
        year = MultiLevelInheritanceVehicles.sc.nextInt();
    }
    public void display(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
}
class Car extends Vehicle{
    int numOfDoors;
    public void setNumOfDoors(){
        numOfDoors=MultiLevelInheritanceVehicles.sc.nextInt();
    }
    public void display(){
        super.display();
        System.out.println("Number of doors: "+numOfDoors);
    }
}
class SportsCar extends Car{
    String type;
    public void setType(){
        type = MultiLevelInheritanceVehicles.sc.next();
    }
    public void display(){
        super.display();
        System.out.print("Type: "+type);
    }
}