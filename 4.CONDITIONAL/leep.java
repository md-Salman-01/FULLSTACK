import java.util.*;
public class leep {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days :");
        int days = sc.nextInt();

        if(days == 365){
            System.out.println("Non Leap year...");
        }
        else if(days == 366){
            System.out.println("Leap year...");
        }
    }
    
}
