package codePractics;
class Bank{
    float getRateOfIntrest(){
        return 0;
    }
}
class SBI extends Bank{
    float getRateOfIntrest(){
        return 8;
    }
}
class AXIS extends Bank{
    float getRateOfIntrest(){
        return 7;
    }
}
class ICIC extends Bank{
    float getRateOfIntrest(){
        return 9;
    }
}

public class BankMain {
    public static void main(String[] args) {
   Bank b;
   b=new SBI();
        System.out.println(b.getRateOfIntrest());
   b=new AXIS();
        System.out.println(b.getRateOfIntrest());
   b=new ICIC();
   //System.out.println(b.getRateOfIntrest());
  // System.out.println(b.getRateOfIntrest());
   System.out.println(b.getRateOfIntrest());

    }
}
