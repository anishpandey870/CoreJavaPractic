package codePractics;

class Address{
    String city,state,country;
    Address(String city,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
}
class Emps{
    int id;
    String name;
    Address address;
    public Emps(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

}

public class AggregationMain2 {
    public static void main(String[] args) {
      Emps e=new Emps(2,"mohit",new Address("jabalpur","madhya pradesh","India"));
      e.display();
    }
}
