
public class try1{
    
    public static void main(String[] args) {
        
     Employe e1 = new Employe();
     e1.setName("Salman", 21);

     Employe e2 = new Employe();
     e2.setName("Soban", 20);
       
     System.out.println(e1.getName() + " " + e1.getAge());
     System.out.println(e2.getName() + " " + e2.getAge());
    }
}
  class Employe{

    private String name;
    private int age ;

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public void setName(String name , int age){
            this.name = name;
            this.age = age;
        }

  }
