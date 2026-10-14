import java.util.*;

public class FriendSearch {

    public static int Friend(String name[],String key){

            for(int i = 0; i<name.length; i++){
                if(name[i]==key){
                    return i;
                }
            }
            return -1;
    }
            public static void main(String[] args) {
                String name[] = {"Soban","Farhan","Khalid","Aman"};

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your friend Name : ");
                String key = sc.nextLine();

                int Result = Friend(name,key);
                if(Result == -1){
                    System.out.println("Not Found...");
                }
                else{
                    System.out.println("Your Friend at : "+Result);
                }
            }


    
}
