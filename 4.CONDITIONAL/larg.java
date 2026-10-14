import java.util.*;
public class larg {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a :");
        int a = sc.nextInt();

        System.out.println("Enter number b :");
        int b = sc.nextInt();

        System.out.println("Enter number b :");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("A is Largest..."+a);
        }
        else if(b>a && b>c){
            System.out.println("B is Largest..."+b);
        }
        else{
            System.out.println("C is Largest...."+c);
        }
    }
    
}
