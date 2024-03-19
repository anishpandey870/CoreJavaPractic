package vehicleProject;

public class Car extends Vehicle{
   private String type;
   private int wheels;
   private int doors;
   private int gears;
  private boolean isManual;
  private int currentGear;

    public Car(String name, String type, int wheels, int doors, int gears, boolean isManual) {
        super(name);
        this.type = type;
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        currentGear=1;
    }

  public void changeGear(int newGear){
     this.currentGear=newGear;
     System.out.println("this current is gear :"+this.currentGear);
    }
   public void changeSpeed(int newSpeed, int newDirection){
     move(newSpeed,newDirection);
     System.out.println("changing speed :"+newSpeed+"changing direction :"+newDirection);
    }
    //getter and setter

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}