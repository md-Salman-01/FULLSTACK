import java.util.*;

public class Chose {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();

        System.out.println("Enter Another Number");
        n=sc.nextInt();
        
        
        while(n%10!=0){
            System.out.println(""+n);
            
            System.out.println("Enter Another Number");
            n=sc.nextInt();
        }
        while(n%10==0){
            System.out.println("This code is break :");
            break;
            
        }
    
    }
}
