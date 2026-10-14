import java.util.*;


public class Food {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Food No :");
        int food = sc.nextInt();

        switch (food) {
        case 1:
                System.out.println("Samosa");
                break;
        
        case 2:
                System.out.println("jalebi");
                break;
        case 3:
                System.out.println("Mithai");
                break;
                
        default:
                System.out.println("Ghntaaa");
                break;
        }
    }
    
}
