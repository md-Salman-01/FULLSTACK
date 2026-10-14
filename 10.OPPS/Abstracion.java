
abstract class Vehicle{

     abstract void start();
 }

 class Car extends Vehicle{
     void start(){
        System.out.println("Car start with self ..");
     }
 }

public class Abstracion{
    public static void main(String[] args) {
        
        //Vehicle = Cant create object of abstract class...

        Car c = new Car();
        c.start();

    }
    
}
