public class ByMethod {

    String color ; 
    int age ;

    void intobj (String c , int a){
        color = c;
        age = a;
    }
    void display(){
        System.out.println(color+" "+age);
    }
    public static void main(String[] args) {
        ByMethod tom = new ByMethod();
        tom.intobj("Black", 6);
        tom.display();
    }
    
}

       