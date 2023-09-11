/*Create a class Animal with a method makeSound), which prints a message indicating the sound the animal makes. Create four subclasses of Animal: Cat, Dog, Horse
and Lion. Each of these subclasses should override the makeSound() method to print a message indicating the sound the Cat = "Meow", Dog = "Bark", Horse =
"Neigh" or Lion = "Roar" makes. Finally, create a Main class that creates an instance of each subclass and calls their makeSound) methods.
Input Format:
Input consists of Single Integer Value from 1 to 4.
Output Format:
Output Consists of String representing the Sound of Animal, it will depend on input,
If input is 1, Meow will be the output.
If input is 2, Bark will be the output.
If input is 3, Neigh will be the output.
If input is 4, Roar will be the output.
Sample input1:
2
Sample output1:
Bark
Sample input2:
3
Sample outout2:
Neigh */
package Test.InheritanceClasses;
import java.util.Scanner;
public class WeirdAnimalSoundInheritance {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Cat objC = new Cat();
        Dog objD = new Dog();
        Horse objH = new Horse();
        Lion objL = new Lion();
        int n = sc.nextInt();
        switch(n){
            case 1:
                objC.makeSound();
                break;
            case 2:
                objD.makeSound();
                break;
            case 3:
                objH.makeSound();
                break;
            case 4:
                objL.makeSound();
                break;
        }
        
    }
}
class Animal{
    public void makeSound(){
        System.out.println("Sound it makes");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}
class Horse extends Animal{
    public void makeSound(){
        System.out.println("Neigh");
    }
}
class Lion extends Animal{
    public void makeSound(){
        System.out.println("Roar");
    }
}