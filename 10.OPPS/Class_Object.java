public class Class_Object {

    String name ; 
    int roll ;

    public void printdata(){
        System.out.println("Name is : "+name);
        System.out.println("Roll No is : "+roll);
    }

        // When u want to store multiple data..
    public static void main(String[] args) {

        Class_Object obj = new Class_Object();
        obj.name = "Salman";
        obj.roll = 20;
        obj.printdata();

        Class_Object obj2 = new Class_Object();
        obj2.name = "Soban";
        obj2.roll = 30;
        obj2.printdata();
    }
}
