package codePractics.collections.CustomCollection.CustomArrayList;

import java.util.ArrayList;

public class DataCustom {

    // size of ArrayList
    int n = 4;
    ArrayList<Data> list = new ArrayList<>();
    public void addValues(int roll[], String name[], int marks[], long phone[]) {
        // ArrayList<Data> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // create an object and send values to the constructor to be saved in the Data class
            list.add(new Data(roll[i], name[i], marks[i], phone[i]));
        }

        // after adding values printing the values test the custom arraylist
        printValues(list);
    }
//remove element
    public void removeElement(int index){
        if(index>=0 && index< list.size()){
            Data removeData =list.remove(index);
            System.out.println("removed data :"+removeData.getPhone());
            printValues(list);
        }else {
            System.out.println("Invalid index :");
        }
    }

    // To print the values
    public void printValues(ArrayList<Data> list) {
       // for (int i = 0; i < n; i++) {
        for(Data data:list){
           // Data data = list.get(i);
            System.out.println(data.getRoll() + " " + data.getName() + " " + data.getMarks() + " " + data.getPhone());
        }
    }
}
