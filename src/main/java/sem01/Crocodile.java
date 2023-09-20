package sem01;

import clinic.Runable;
import clinic.Swimable;

import java.time.LocalDate;
import java.util.List;

public class Crocodile extends Animal implements Runable, Swimable {
    public Crocodile(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color, double speed) {
        super(name, weight, owner, birthDay, vaccinations, color, speed);
    }

    public Crocodile(String name) {
        super(name);
    }

    public Crocodile(String name, double speed) {
        super(name, speed);
    }

    @Override
    public void getRunSpeed() {
        System.out.printf("%s по кличке '%s' догоняет добычу со скоростью %.1f%n", this.TYPE, this.getName(), this.getSpeed());
    }

    @Override
    public void getSwimSpeed() {
        System.out.printf("%s по кличке '%s' переплывает Нил со скоростью %.1f%n", this.TYPE, this.getName(), this.getSpeed());
    }
}
