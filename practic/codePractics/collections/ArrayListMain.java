package codePractics.collections;

import java.util.*;


public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Submit");
        list.add("Anish");
        list.add("Akhil");
        list.add("Bandhu");
        list.add(null);
        list.add("Anish");
        list.add(3,"Sudhira");
        list.set(5,"Suman");
        list.remove(0);

//        System.out.println(list.get(4));
//        System.out.println(list.size());
//        Iterator it=list.iterator();
//        while (it.hasNext()){
//            System.out.print(it.next()+" ");
//        }
//        System.out.println();
        ArrayList<String> list1 =new ArrayList<>();
        list1.addAll(list);
        list1.add("Raju");
        for(String st : list1){
          //  System.out.print(st+" ");
        }
        String s=list1.get(3);
        System.out.println(s);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(list.hashCode());
    }
}
