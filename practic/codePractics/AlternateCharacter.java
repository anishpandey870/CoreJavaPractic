package codePractics;

import java.io.*;
import java.util.*;

public class AlternateCharacter {
  // static char ech='A';
    public static void main(String[] args) {
        char ech='A';
        for (int i = 1; i <= 26; i++) {

            if((ech>='A' && ech<='Z') ||(ech>='a' && ech<='z')){
                if(ech%2==0){
                    for(int j=1;j<=2;j++){
                        System.out.print(Character.toLowerCase(ech));
                    }
                    ech++;
                }else{
                    for(int j=1;j<=3;j++){
                        System.out.print(Character.toUpperCase(ech));
                    }
                    ech++;
                }
                System.out.println();
            }
        }
    }
}