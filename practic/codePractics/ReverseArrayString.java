package codePractics;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayString {
//    static void reverse(String myArray[])
//    {
//        Collections.reverse(Arrays.asList(myArray));
//        System.out.println("Reversed Array:" + Arrays.asList(myArray));
//    }

    public static void main(String[] args)
    {
        String [] my = {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
        String rs ="Hi ";
        for(int i=my.length-1;i>=0;i--){
            if(i==0){
                rs=rs+" and ";
                rs=rs+" "+my[i];
            }
           else{
                rs=rs+", "+my[i];
            }
        }
        System.out.println(rs);




    }
}
