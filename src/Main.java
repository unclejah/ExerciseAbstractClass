import beepers.Beeper;
import beepers.BusBeeper;
import beepers.Horn;
import beepers.MagicSound;
import engines.Engine;
import engines.EngineBus;
import engines.EngineV12;
import engines.EngineV6;
import people.People;
import people.PeopleBus;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Beeper horn = new Horn();
        Engine engineV12 = new EngineV12();
        Lambo lambo = new Lambo(horn,engineV12);

        System.out.println(lambo.beeper.makeSound());
        System.out.println(lambo.engine.getSpeed());
        System.out.println("//======================================================");
//======================================================
        Beeper magicSound = new MagicSound();
        Engine engineV6 = new EngineV6();
        Priora priora = new Priora(magicSound,engineV6);

        System.out.println(priora.beeper.makeSound());
        System.out.println(priora.engine.getSpeed());
        System.out.println("//======================================================");
//======================================================
        ArrayList<Car> transporter = new ArrayList();
        transporter.add(lambo);
        transporter.add(priora);
        transporter.forEach((Car car) ->{
            System.out.println(car.beeper.makeSound());
            System.out.println(car.engine.getSpeed());
        });
        System.out.println("//======================================================");
//======================================================
        Beeper busBeeper = new BusBeeper();
        Engine engineBus = new EngineBus();
        People peopleBus = new PeopleBus();
        SchoolBus schoolBus = new SchoolBus(busBeeper,engineBus,peopleBus);

        System.out.println(schoolBus.beeper.makeSound());
        System.out.println(schoolBus.engine.getSpeed());
        System.out.println(schoolBus.people.getCountOfPeople());
    }

}