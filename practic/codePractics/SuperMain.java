package codePractics;
class Person{
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Empo extends Person{
    float sal;

    Empo(int id,String name){
       super(id,name);
       //this.sal=sal;
    }
    {sal=4000;}
    {System.out.println("this instance block");}
    void details(){
        System.out.println(id+" "+name+" "+sal);
    }
}
public class SuperMain {
    public static void main(String[] args) {
        Empo m=new Empo(2,"raju");
        m.details();
    }
}
