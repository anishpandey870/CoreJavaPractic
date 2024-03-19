package codePractics;
class Animals{
    void run(){
        System.out.println("animlas running");
    }
}
class Cat extends Animals{
void run(){
    System.out.println("animlas running");
}
}

public class InstanceOfMain {
    public static void main(String[] args) {
        Animals a=new Animals();
        Animals c=new Cat();
       // c=null;
        System.out.println(a instanceof Animals);
        System.out.println(c instanceof Animals);
        System.out.println(c instanceof Cat);
    }
}
