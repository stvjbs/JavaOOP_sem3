package sem01;

import clinic.Runable;
import clinic.Swimable;

import java.time.LocalDate;
import java.util.List;

public class Ostrich extends Animal implements Runable, Swimable {
    public Ostrich(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color, double speed) {
        super(name, weight, owner, birthDay, vaccinations, color, speed);
    }

    public Ostrich(String name) {
        super(name);
    }

    public Ostrich(String name, double speed) {
        super(name, speed);
    }

    @Override
    public void getRunSpeed() {
        System.out.printf("%s по кличке '%s' бегает по пререям со скоростью %.1f%n", this.TYPE, this.getName(), this.getSpeed());
    }

    @Override
    public void getSwimSpeed() {
        System.out.printf("%s по кличке '%s' плавает в озере со скоростью %.1f%n", this.TYPE, this.getName(), this.getSpeed());
    }
}
