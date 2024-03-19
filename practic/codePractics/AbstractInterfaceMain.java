package codePractics;
interface Show{
    void a();
    void b();
    void c();

}
abstract class Get implements Show{
    @Override
    public void a() {
        System.out.println("this my class a");
    }
}
class Save extends Get{
    public void b(){
        System.out.println("this my b class");
    }
    public void c(){
        System.out.println("this my c class");
    }

}
public class AbstractInterfaceMain {
    public static void main(String[] args) {
        Save s=new Save();
        s.a();
        s.b();
        s.c();
    }
}
