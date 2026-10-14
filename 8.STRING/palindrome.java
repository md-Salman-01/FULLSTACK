public class palindrome {

    public static void main(String[] args) {
         
        String str = "salman ";
        String s = "";

        for(int i=str.length()-1; i>=0; i--){
            s = s+str.charAt(i);
        }

        if(str.equals(s)){
            System.out.println("Palindrome String...");
        }
        else{
            System.out.println("Not a Palindrome String");
        }
    }
    
}
