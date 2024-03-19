package codePractics;

class Adds{
    int get(int x,int y){
        return x*y;
    }
}
class Base extends Adds{
    int get(int x,int y){
        return x+y;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Base base=new Base();
       System.out.println(base.get(2,4));

    }
}
