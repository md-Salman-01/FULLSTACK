import java.util.*;

public class Result {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the marks :");
        int marks = sc.nextInt();

        if(marks>=33){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail...");
        }

    }
} 