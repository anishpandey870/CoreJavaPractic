package codePractics;
abstract class bike{
    abstract void run();
}
class Honda extends bike{
    public void run(){
        System.out.println("bike is running");
    }

}

public class AbstractMain {
    public static void main(String[] args) {
        Honda h=new Honda();
        h.run();
    }
}
