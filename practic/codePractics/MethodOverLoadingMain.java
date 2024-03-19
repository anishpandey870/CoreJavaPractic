package codePractics;
class Square{
    static int getMul(int a,int b){
        return a*b;
    }
    static int getMul(int a,int b,int c){
        return a*b*c;
    }
        }

public class MethodOverLoadingMain {
   static int getAdd(int a,int b){
        return a+b;
    }

    static double getAdd(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
     int res1=   MethodOverLoadingMain.getAdd(4,5);
    System.out.println(MethodOverLoadingMain.getAdd(4,5,6));
      System.out.println(Square.getMul(3,3)+" "+Square.getMul(2,2,2));
     // System.out.println(res1+" "+res2);
    }
}
