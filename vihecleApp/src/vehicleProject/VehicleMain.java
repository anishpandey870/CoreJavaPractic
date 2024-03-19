package vehicleProject;

public class VehicleMain {
    public static void main(String[] args) {
        Suv suv=new Suv("fortunar",false);
      //  suv.move(20,0);
      //  suv.accelerator(10);
        suv.accelerator(0);
        System.out.println("get Current gear :"+suv.getCurrentGear());
    }
}
