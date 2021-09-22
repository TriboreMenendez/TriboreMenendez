package car;

import beepers.Beep;
import engines.Engine;
import wheels.Wheel;

public class Bus extends Car {
    public int route;

    public Bus(Beep carBeep, Engine carEngine, Wheel carWheel, int route) {
        super(carBeep, carEngine, carWheel);
        this.route = route;
    }

    public void Drive () {System.out.println("Bus drive");}
    public void CheckRoute () {System.out.println("This bus drive in route - " + route);}
}
