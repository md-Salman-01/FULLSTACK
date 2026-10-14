
abstract class Bus{
    abstract void station();    
}

class Car extends Bus{

        void station(){
            System.out.println("All the Passenger are In..");
        }    
}

public class Abst{
    public static void main(String[] args) {
    
        Car c = new Car();
        c.station();
    }
}