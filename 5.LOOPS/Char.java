public class Char {

    public static void main(String[] args) {

        int n = 4;
        char ch = 'A';
        
        for(int i= 1; i<=n; i++){

          for(int charcter=1; charcter<=i; charcter++){
            System.out.print(ch);
            ch++;
          }
        System.out.println();

        }
    }
}
