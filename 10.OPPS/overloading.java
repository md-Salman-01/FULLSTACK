
public class overloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(10,20));
        System.out.println(cal.sum(10,20,30));
        System.out.println(cal.sum(10,20,30,40));
        
    }    

}

 class Calculator{

    int sum(int a ,int b){
        return a+b;
    }

     int sum(int a ,int b,int c){
        return a+b+c;
    }
     int sum(int a ,int b,int c ,int d){
        return a+b+c+d;
    }
    
}