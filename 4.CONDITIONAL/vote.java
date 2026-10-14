import java.util.*;
public class vote {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age :");
        int age = sc.nextInt();
        

        if(age <= 18){
            System.out.println("You are not eligible to Vote..");
        }
        else if(age >=18){
            System.out.println("You can vote....");
        }
    }
    
}
