
class student{

String name;
int roll;

 //Creating Constructor.
    student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }  
    void display(){
      System.out.println(name +" "+ roll);
    }
}

public class Const {
  public static void main(String[] args) {

    student std = new student("salman", 90);
    std.display();

    student std1 = new student("Aman", 100);  
    std1.display();  

  }  
}
