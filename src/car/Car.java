package car;

import beepers.Beep;
import engines.Engine;
import wheels.Wheel;

public abstract class Car {
    private Beep carBeep;
    private Engine carEngine;
    private Wheel carWheel;

    public Car (Beep carBeep, Engine carEngine, Wheel carWheel){
        this.carBeep = carBeep;
        this.carEngine = carEngine;
        this.carWheel = carWheel;
    }

    public String checkBeep () {return carBeep.makeSound();}
    public String checkSpeed () {return carEngine.makeRotation();}
    public int checkWheel () {return carWheel.wheelDiameter();}

    public void Honk () {System.out.println(checkBeep());}
    public void speedCheck () { System.out.println("Speed auto - " + checkSpeed());}
    public void wheelCheck () { System.out.println("Wheel size - " + checkWheel());}
    public void Drive (){System.out.println();}
}
