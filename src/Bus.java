import beepers.Beeper;
import engines.Engine;
import people.People;

public abstract class Bus {
    Beeper beeper;
    Engine engine;
    People people;

    public Bus(Beeper beeper, Engine engine,People people){
        this.beeper = beeper;
        this.engine = engine;
        this.people = people;
    }
}
