package codePractics;

class Factorial{

    int fact=1;
    void fac(int n){
        for(int i=1;i<=n;i++){
           fact=fact*i;
            System.out.println(fact);
        }
    //   System.out.println(fact);
    }
}
public class AnonymusMain {
    public static void main(String[] args) {
        new Factorial().fac(5);
    }
}
