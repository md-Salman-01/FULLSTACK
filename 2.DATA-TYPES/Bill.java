import java.util.*;

public class Bill {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cost of pencil is :");
        Float pencil =sc.nextFloat();

        System.out.println("Cost of sharpner is :");
        Float sharpner =sc.nextFloat();

        System.out.println("Cost of eraser is :");
        Float eraser =sc.nextFloat();

        Float Bill = pencil + sharpner + eraser ;

        System.out.println("Your Bill is :"+Bill);
        
    }
    
}
