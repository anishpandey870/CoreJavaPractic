package codePractics.collections.CustomCollection.CustomArrayList;

public class DataMain {
    public static void main(String args[]) {
        // Custom input data
        int roll[] = {1, 2, 3, 4};
        String name[] = {"Shubham", "Atul", "Ayush", "Rupesh"};
        int marks[] = {100, 99, 93, 94};
        long phone[] = {8762357381L, 8762357382L, 8762357383L, 8762357384L};

        // Creating an object of the class
        DataCustom custom = new DataCustom();

        // Now calling function to add the values to the arraylist
        custom.addValues(roll, name, marks, phone);
        custom.removeElement(2);
    }
}
