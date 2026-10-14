
class student{

    String name ;
    int roll;
    String city;

    public void study(){
        System.out.println(name);
    }

    public void fullDetail(){
    System.out.println("My name is " + name);
    System.out.println("My roll is " + roll);
    System.out.println("I Live in "+ city);
    }
}
public class Class {

    public static void main(String[] args) {
        student std = new student();

        std.name = "Salman Khan";
        std.study();

        student std1 = new student();
        std1.name = "Salman Ahmad";
        std1.roll = 89;
        std1.city = "Delhi";
        std1.fullDetail();
    }
}
