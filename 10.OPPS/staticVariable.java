
class Emp{

    int empid;
    String name;
    static String company = "WIPRO";
    
    Emp(int empid, String name){
        this.empid = empid;
        this.name = name;
    }

    void display(){
        System.out.println(empid+ " " + name + " " +company);
    }
}

 public class staticVariable {
    public static void main(String[] args) {
     
        Emp e1 = new Emp(101, "Salman");
        Emp e2 = new Emp(102, "soban");
        Emp e3 = new Emp(103, "farhan");

        e1.display();
        e2.display();
        e3.display();
    }
}