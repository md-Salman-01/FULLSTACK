
class MethodOverloading{
  
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static String sum(String a, String b){
        return a + b ;
    }
    
    public static void main(String[] args) {
        
        System.out.println(sum(10,30));
        System.out.println(sum(1.4f,1.8f));
        System.out.println(sum("Hello","Frnd"));

    }
}


