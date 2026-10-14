public class ByRefernce {
    
    String color ;
    int  age ;
    
    public static void main(String[] args) {
        
        ByRefernce buzo = new ByRefernce();
        buzo.color = "Red";
        buzo.age = 10;
        System.out.println(buzo.color +" "+ buzo.age);
    }
}
