
 class Student{
        
    String name ;
    int age; 

    Student(String name, int age){
            this.name = name;
            this.age = age;
            
            System.out.println(name);
            System.out.println(age);
        }
    }
public class Constructor {
    
    public static void main(String[] args) {
         
        Student obj = new Student("Salman", 20);
    }
}
