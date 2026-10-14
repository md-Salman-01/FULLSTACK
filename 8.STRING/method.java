import java.sql.Struct;

public class method {
    
    public static void main(String[] args) {

        //Length().
        String name =  "Salman";
        System.out.println(name.length());

        //Trim().
        String name1 = "   Ahmad   ";
        System.out.println(name1.trim());

        //equals().
        System.out.println(name.equals(name1));

        //compareTo().
        String s1 = "a";
        String s2 = "A";
        System.out.println(s1.compareTo(s2));

        //compareToIgnoreCase().
        String s3 = "a";
        String s4 = "A";
        System.out.println(s1.compareToIgnoreCase(s4));


    }
}
