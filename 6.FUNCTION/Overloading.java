public class Overloading {

    public static int sum(int a, int b){
        return a+b;

    }
    public static int sum(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
     
        System.out.println("Sum of 2 number is :"+sum(10,20));
        System.out.println("Sum of 3 number is :"+sum(10,20,30));
        
    }

}
