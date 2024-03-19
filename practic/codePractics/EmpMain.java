package codePractics;

class Employee{
    int id ;
   static String name;
    double sal;
    void record(int uni,String emp,double gross){
        id=uni;
        name=emp;
        sal=gross;
        System.out.println(uni +" "+emp+" "+gross);
    }
}
class Engineer{
    int id ;
  static String name;
    double sal;
}

public class EmpMain {
    String name;
    public static void main(String[] args) {
        Employee e=new Employee();
        e.name="Anish";
        Engineer i=new Engineer();
        i.name="Tej";
        System.out.println(e.id+" "+e.name+" "+e.sal);
        System.out.println(i.id+" "+i.name+" "+i.sal);
        e.record(5,"somu",2344);
    }
}
