import java.util.*;

public class Area {

    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the value of Radius  :");
        Float rad = sc.nextFloat();

        Float area = 3.14f * rad * rad;

        System.out.println("Area of the Circle is :"+area);

    }
    
}
