package codePractics;
class Animal1{
}
class fox extends Animal1{
    static void mac(Animal1 a){
        if(a instanceof fox){
            fox f =(fox)a;
            System.out.println("belong to parent class");
        }

    }
}
public class DownCastingMain {
    public static void main(String[] args) {
        Animal1 a=new fox();
        fox.mac(a);
    }
}
