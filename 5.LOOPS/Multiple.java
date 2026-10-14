import java.util.*;

public class Multiple {
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();

    do {
        
        System.out.println("Enter your Number : ");
        int number = sc.nextInt();

        if (number % 10 == 0) {
            continue;
        }

        System.out.println("Your number is : "+number);

    } while(true);

        
    }

}

