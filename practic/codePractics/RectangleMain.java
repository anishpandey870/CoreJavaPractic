package codePractics;

class Rectangel{
    int len;
    int width;
    int hieght;
    void area(int l,int b,int h){
        len=l;
        width =b;
        hieght =h;
        System.out.println(l+" "+b+" "+h);
    }

}
public class RectangleMain {
    public static void main(String[] args) {
        Rectangel r=new Rectangel();
        r.area(2,3,4);


    }
}
