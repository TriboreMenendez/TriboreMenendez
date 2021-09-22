package car;

import beepers.Beep;
import engines.Engine;
import wheels.Wheel;

public class SportCar extends Car{
    public SportCar(Beep carBeep, Engine carEngine, Wheel carWheel) {
        super(carBeep, carEngine, carWheel);
    }
}
