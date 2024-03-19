package vehicleProject;

public class Suv extends Car{

    public Suv(String name,boolean isManual) {
        super(name,"SUV", 4,5,4, isManual);
    }
    public void accelerator(int rate){
        int newSpeed=getCurrentSpeed()+rate;
        /*
        *speed =0,gear=1
        * speed =0-10, gear=1
        * speed =10-20, gear=2
        * speed =20-30, gear=3
        * 4
         */
        if(newSpeed==0){
            stop();
            changeGear(1);
        } else if (newSpeed>0 && newSpeed<=10) {
            changeGear(1);
        }else if (newSpeed>10 && newSpeed<=20) {
            changeGear(2);
        }else if (newSpeed>20 && newSpeed<=30) {
            changeGear(3);
        }else{
            changeGear(4);
        }

        if(newSpeed>0){
            changeSpeed(newSpeed,getCurrentDirection());
        }
    }
}
