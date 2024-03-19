package vehicleProject;
 public class Vehicle{
  private   String name;
  private   int currentSpeed;
    private int currentDirection;

//    public Vehicle() {
//    }
    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }
   public void steer(int direction){
       this.currentDirection=currentDirection+direction;
        System.out.println("this is change direction : "+currentDirection);
   }
   public void move(int speed, int direction){
     currentSpeed=speed;
     currentDirection=direction;
     System.out.println("move method called moving :"+currentSpeed+"direction :"+currentDirection);
    }
    public void stop(){
        this.currentSpeed=0;
        System.out.println("Vehicle stop");
    }
//getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}


