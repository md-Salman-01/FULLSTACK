import java.util.*;

public class Largest {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number A :");
        int a = sc.nextInt();

        System.out.println("Enter the number B :");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("A is the largest number :");
        }
        else{
            System.out.println("B is the largest number");
        }


    }

}
