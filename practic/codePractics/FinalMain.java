package codePractics;
class Car{
    final int speed;
    Car(){
        speed=30;
    }
    void run(){
        System.out.println("this is car speed");
    }
}
class Suv extends Car{
    @Override
    void run(){
        System.out.println("this the child class car speed");
    }
}
public class FinalMain {
    public static void main(String[] args) {
        Car c=new Suv();
      //  c.speed=40;
        System.out.println(c.speed);
     //   c.run();
    }
}
