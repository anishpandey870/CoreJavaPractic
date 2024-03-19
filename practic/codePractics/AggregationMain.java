package codePractics;
class Operation{
    int square(int n){
        return n*n;
    }
}
class Circle{
    double pi=3.14;
    Operation op;
    double area(int radius){
        op=new Operation();
        int rsquare= op.square(radius);
        return pi*rsquare;
    }
}



public class AggregationMain {
    public static void main(String[] args) {
    Circle c=new Circle();
   double result= c.area(2);
    System.out.println(result);

    }
}
