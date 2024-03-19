package codePractics;
class Account{
    int acc_no;
    String name;
    float amount;

//    void insert(int ac,String name,float amt){
//        acc_no =ac;
//        name=name;
//        amount=amt;
//    }
    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amt+"deposit");
    }
void withdraw(float amt){
        if(amount<amt){
            System.out.println("insufficient balance");
        }else{
            amount =amount-amt;
            System.out.println(amt+"withdraw");
        }
}
    void checkBalance(){
        System.out.println(amount+"balanace");
    }
}
public class AcountMain {
    public static void main(String[] args) {
    Account a=new Account();
    a.deposit(4000);
    a.withdraw(2000);
    a.checkBalance();
    }
}
