
 import java.util.*;

public class Calculate {

    public static int CalculateSum(int a, int b){

        int sum = a+b;
        return  sum;
    }
    public static void main(String[] args) {
     
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter A :");
            int a =sc.nextInt();

            System.out.println("Enter B :");
            int b =sc.nextInt();

            int sum = CalculateSum(a, b);

            System.out.println("Sum of a and b  is : "+sum);
        
    }
    
}
