package codePractics.collections.CustomCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(44, "rakesh", "City Convent", new StudentAddress("Mathikere")));
        students.add(new Student(323, "Suman", "delhi Public", new StudentAddress("Electronic City")));
        students.add(new Student(24,"Aman","KV",new StudentAddress("BTM layout")));
        Iterator<Student> it = students.iterator();

      //  while (it.hasNext()) {
          //  System.out.println(it.next());
       //}
     //   Student stu = students.get(1);
       // System.out.println(stu);
        for(Student s:students){
            System.out.println(s.getId()+" "+s.getName()+" "+s.getSchoolName()+" "+s.getStudentAddress());
        }
        //Student st = students.remove(2);
        //System.out.println(st);
    }
}
//7081120277 adars