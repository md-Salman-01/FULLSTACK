
public class Methodoverride {

    public static void main(String[] args) {
        
        SBI obj = new SBI();
        Bank obj1 = new Bank();
        obj1.Interrest();
        obj.Interrest();
    }
}

class Bank{
    void Interrest(){
        System.out.println("5%");
    }
}

class SBI extends Bank{
    void Interrest(){
        System.out.println("10%");
    }
}