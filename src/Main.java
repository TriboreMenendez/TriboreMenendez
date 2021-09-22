import car.Bus;
import beepers.Horn;
import car.SportCar;
import car.Truck;
import engines.Engine6v;
import engines.Engine8v;
import engines.EngineSport;
import wheels.Wheel18;
import wheels.Wheel22;

public class Main {

    public static void main (String [] args) {;
        //создаем автобус с маршрутом
        Bus bus = new Bus(new Horn(), new Engine6v(), new Wheel18(), 330);
        bus.Drive();
        bus.Honk();
        bus.CheckRoute();

        //создаем грузовик с грузоподъемностью 5 тонн
        Truck truck = new Truck(new Horn(), new Engine8v(), new Wheel22(),5000);
        truck.CheckLifgting();
        truck.speedCheck();
        truck.wheelCheck();
        truck.Load();
        truck.Unload();

        //создаем спортивный автомобиль
        SportCar sportCar = new SportCar(new Horn(), new EngineSport(), new Wheel22());
        sportCar.speedCheck();
    }
}
