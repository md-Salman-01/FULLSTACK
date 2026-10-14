import java.util.*;

public class Product {

    public static int Products(int a , int b){

        int multiple = a * b;

        return multiple; 
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of  A  :");
        int a = sc.nextInt();

        System.out.println("Enter the value of B is :");
        int b = sc.nextInt();

        int result = Products(a,b);

        System.out.println("Product of and b is : "+result);
    }
    

}
