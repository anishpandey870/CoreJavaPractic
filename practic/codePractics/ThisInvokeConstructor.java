package codePractics;
class Add{
    ThisInvokeConstructor obj;
    void get(Add obj){
        System.out.println("this my argumrnt pass by this ");
    }
    void p(){
        System.out.println();
    }

}
public class ThisInvokeConstructor {
    public static void main(String[] args) {
        Add a=new Add();
        a.p();
    }
}
