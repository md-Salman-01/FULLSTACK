 import java.util.*;

public class LinearSearch {

        public static int Search(int num[], int key){
            for(int i = 0; i<num.length; i++){
                if(num[i]==key){
                    return i;
                }
            }
            return-1;        
        }
        public static void main(String[] args) {
            int num[] = {10,20,30,40,50};

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the key :");
            int key = sc.nextInt();

        int result = Search(num , key);
        if(result == -1){
            System.out.println("Not Found...");
        }
        else{
            System.out.println("Key at index of :"+result);
        }

    }
}

