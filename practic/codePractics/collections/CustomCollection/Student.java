package codePractics.collections.CustomCollection;

public class Student {
    private int id;
    private String name ;
    private String SchoolName;
    private StudentAddress studentAddress;
//Constructor
    public Student(int id, String name, String schoolName,StudentAddress studentAddress) {
        this.id = id;
        this.name = name;
        SchoolName = schoolName;
        this.studentAddress=studentAddress;
    }
//getter and setter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public StudentAddress getStudentAddress() {
        return studentAddress;
    }

//toString

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", SchoolName='" + SchoolName + '\'' +
                ", studentAddress=" + studentAddress +
                '}';
    }
}
