
import java.util.*;

public class Age {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Age :");
        int age = sc.nextInt();

        if(age<10){
            System.out.println("Toodler...");
        }

        else if(age>=18){
            System.out.println("Adult...");
        }
        
    }
    
}
