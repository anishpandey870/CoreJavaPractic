package codePractics;

public class Student {
    int id;
   static String name ;

//   public void go(){
//       System.out.println("Stuent go school by school bus");
//   }
   public   void go(){
        System.out.println("Stuent go school by school bus");
    }

    public static void main(String[] args) {
        Student s =new Student();
        s.id=2;
        s.name="Raju";
        Student s1= new Student();
         s1.go();
        System.out .println(s.id +" "+s.name);
        System.out .println(s1.id +" "+s1.name);
        s.go();
    }
}
