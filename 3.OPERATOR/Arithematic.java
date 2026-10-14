import java.util.*;

public class Arithematic {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of A :");
        int a = sc.nextInt();

        System.out.println("Enter the value of  B :");
        int b = sc.nextInt();

        System.out.println("Sum of A and B is :"+ (a+b));
        System.out.println("Sum of A and B is :"+ (a-b));
        System.out.println("Sum of A and B is :"+ (a*b));
        System.out.println("Sum of A and B is :"+ (a/b));
        System.out.println("Sum of A and B is :"+ (a%b));

    }
    
}
