import java.util.*;

   class addittion{

    int add(int a, int b){
        int ans = a+b;
        return ans;
    }
  }

public class sum{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a :");
        int a = sc.nextInt();

        System.out.print("Enter b :");
        int b = sc.nextInt();

        addittion obj = new addittion();
        int result = obj.add(a,b);
        
        System.out.print("Sum of a and b is :"+result);
    }
}
