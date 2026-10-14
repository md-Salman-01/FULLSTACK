import java.util.*;


public class Square {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square :");
        int side = sc.nextInt();
        
        int SquareArea = side * side;

        System.out.println("Area of Square is :"+SquareArea);

    }

}
