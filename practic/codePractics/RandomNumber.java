package codePractics;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        //using random()
//        System.out.println(" this first num :"+Math.random());
//        System.out.println(" this first num :"+Math.random());
//        System.out.println(" this first num :"+Math.random());
//        System.out.println(" this first num :"+Math.random());

//        //using Ramdom class
//        Random ram = new Random();
//        int y = ram.nextInt(1000);
//        System.out.println(y);
        //using Math.ramdom()*(max-min+1)+min
        int min=1,max=1000;
        double x=Math.random()*(max-min+1)+min;
        System.out.println(x);
    }
}
