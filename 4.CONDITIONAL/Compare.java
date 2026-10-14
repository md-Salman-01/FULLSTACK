import java.util.*;

public class Compare {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the age :");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You can Vote...");
        }
        else{
            System.out.println("No u can't vote...");
        }

    }
    
}
