public class ByContructor {

    String name ;
    int age ;

    ByContructor(String name, int age){
        this.name = name ;
        this.age = age;
    }
    public static void main(String[] args) {

        ByContructor e1 = new ByContructor("Salman",25);
        ByContructor e2 = new ByContructor("Soban",24);
        ByContructor e3 = new ByContructor("Farhan",21);
        ByContructor e4 = new ByContructor("Khalid",26);

        System.out.println("Employee 1: " + e1.name + ", Age: " + e1.age);
        System.out.println("Employee 2: " + e2.name + ", Age: " + e2.age);
        System.out.println("Employee 2: " + e3.name + ", Age: " + e3.age);
        System.out.println("Employee 2: " + e4.name + ", Age: " + e4.age);
    }
}
