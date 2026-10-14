import java.util.*;

public class TaxCalculator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the character  : ");
        char Character = sc.next().charAt(0);

        if(Character >='a' && Character <= 'z'){
            System.out.println("These are small letter");
        }
        else if(Character >='A' && Character <= 'Z'){
            System.out.println("These are Capital Letter");
        }

        else if(Character >= '1' && Character <= '9'){
            System.out.println("These are digit");
        }
        else{
            System.out.println("----BEROZGAR----");
        }

    }

}
