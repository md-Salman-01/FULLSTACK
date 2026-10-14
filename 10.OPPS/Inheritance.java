public class Inheritance {

    public static void main(String[] args) {
    
    car car1 = new car();
    car1.price = 2000000;
    car1.color = "Red";
    car1.fuel = "Petrol";
    car1.brand = "Tata";
    car1.milge = 19;
    car1.sunroof = true;

    car1.display();
    car1.show();

    }
}
class Vehical{

    double price;
    String color;
    String fuel;

    void display(){
        System.out.println("Price"+" "+price);
        System.out.println("Color"+" "+color);
        System.out.println("Fuel"+" "+fuel);
    }
}
class car extends Vehical{

    String brand;
    int milge;
    boolean sunroof;

    void show(){
        System.out.println("brand :"+brand);
        System.out.println("milge "+milge);
        System.out.println("sunroof "+sunroof);
    }
}
