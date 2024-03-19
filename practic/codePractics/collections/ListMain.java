package codePractics.collections;

import java.util.*;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 4);
        System.out.println(list);
        List list1 = new ArrayList<>();
        list1.add("saurab");
        list1.add("Ravi");
        list1.addAll(list);
        System.out.println(list1);
        list1.set(1, "Rocky");
        System.out.println(list1);
        Iterator it = list1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.contains(3));
        boolean search = list1.contains("Rocky");
        System.out.println(search);
        for (Integer i : list) {
            System.out.print(i + " ");
        }

    }
}
