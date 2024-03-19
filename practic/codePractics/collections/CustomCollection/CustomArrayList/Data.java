package codePractics.collections.CustomCollection.CustomArrayList;

class Data {
 private    int roll;
  private   String name;
  private   int marks;
  private   long phone;

    // Constructor
    Data(int roll, String name, int marks, long phone) {
        // this refers to current instance
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.phone = phone;
    }
    //getter and setter

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
