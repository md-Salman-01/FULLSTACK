import java.util.*;

public class LastNumber {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nth Number :");
        int n  = sc.nextInt();

        int i = 1;

        while (i<=n) {
            System.err.println(i);
            i++;
        }
    }

}
