import java.util.*;


public class AverageMethod {
    
    public static int average(int a,int b, int c){

        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number A :");
        int a = sc.nextInt();

        System.out.println("Enter the number B :");
        int b = sc.nextInt();

        System.out.println("Enter the number c :");
        int c = sc.nextInt();

        int result = average(a,b,c);
        System.out.println("The average of three number is :"+result);

    }

}
