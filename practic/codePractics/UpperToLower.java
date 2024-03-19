package codePractics;

import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if((ch>='a' && ch <='z')||(ch>='A' && ch <='Z')){
           if(ch>='a' && ch <='z'){
            ch=(char)(ch-32);
          // System.out.println(ch);
           }
           else{
           ch=(char)(ch+32);
       // System.out.println(ch);
       }
            ch -=2;
            if((ch>='A' && ch <='Z') || (ch>='a' && ch <='z')) {
                    System.out.println(ch);
                } else {
                    System.out.println("Sorry");
                }
        }
        else{
            System.out.println("N0");
        }

    }
}
