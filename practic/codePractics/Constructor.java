package codePractics;

public class Constructor {
    int id;
    String name;
    Constructor(){
        System.out.println("this my default constructor");
    }
    Constructor(int i ,String n){
       id=i;
       name=n;
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Constructor c=new Constructor(2,"ram");
        c.display();
    }
}
