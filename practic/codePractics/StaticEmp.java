package codePractics;
class Emp{
    int id;
    String name;
  static  String company;
    Emp(int idn,String ename){
        id=idn;
        name=ename;
       company="tcs";
    }
    void display(){
        System.out.println(id+" "+name+" "+company);
    }
}
public class StaticEmp {
    public static void main(String[] args) {
        Emp e1=new Emp(1,"sunil");
        Emp e2=new Emp(2,"Rama");
        e1.display();
        e2.display();
    }
}
