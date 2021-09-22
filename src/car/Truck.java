package car;

import beepers.Beep;
import engines.Engine;
import wheels.Wheel;

public class Truck extends Car{
    public int liftingCapacity;
    public Truck(Beep carBeep, Engine carEngine, Wheel carWheel, int liftingCapacity) {
        super(carBeep, carEngine, carWheel);
        this.liftingCapacity=liftingCapacity;
    }

    public void Drive (){
        System.out.println("Truck drive");
    }
    public void CheckLifgting () {System.out.println("Lifting capacity truck - " + liftingCapacity + " kg");}
    public void Load() {System.out.println("Load cargo");}
    public void Unload () {System.out.println("Unload cargo");}
}
