
public class LargesFindt {

    public static int Find (int num[] ){

        int Larg = Integer.MIN_VALUE;

        for(int i = 0; i<num.length;i++){
            if(Larg < num[i]){
                Larg = num[i];
            }
        }
        return Larg;
    }
        public static void main(String[] args) {
        
            int num[] = {1,2,5,6,35,104,3,42,43,2,13,12,311,4,};

            int result = Find(num);
            System.out.println("Largst Number is :"+result);
    }

}