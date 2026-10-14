
 class Student{

    private String name;
    private int age ;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}

public class Encap {
    
    public static void main(String[] args) {
        Student std = new Student();

        std.setName("Salman");
        std.setAge(10);

        System.out.println(std.getName());
        System.out.println(std.getAge());
    }
}
