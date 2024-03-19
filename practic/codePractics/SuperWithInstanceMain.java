package codePractics;
class Animal{
    String color="black";
    Animal(){
        System.out.println("this base class");
    }
    void eat(){
        System.out.println("Animal is eating meat");
    }
}
class Dog extends Animal{
    String color ="white";
    Dog(){
        super();
        System.out.println("this my sub class");
    }
    void eat(){
        System.out.println("dod is eating bread");
    }
    void printColor(){
        super.eat();
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class SuperWithInstanceMain {
    public static void main(String[] args) {
        Dog d=new Dog();
       // d.printColor();
    }
}
