package codePractics.collections.CustomCollection;

public class StudentAddress {
    String address;

    public StudentAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentAddress{" +
                "address='" + address + '\'' +
                '}';
    }
}
