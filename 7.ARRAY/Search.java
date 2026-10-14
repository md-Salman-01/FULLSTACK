
public class Search {
    
    public static int Food( String menu[], String key){
        for(int i = 0; i<menu.length; i++){

            if (menu[i]==key){
                return i;
            }
            }
            return -1;
    }

    public static void main(String[] args) {
        String menu[] = {"Samosa","jalebi","Chai","Maggi"};

        String key = "Chai";

        int result = Food(menu, key);
        if (result == -1) {
            System.out.println("Not Found....");   
        }
        else{
            System.out.println("Your item at : "+result+" index.");
        }
    }

}
