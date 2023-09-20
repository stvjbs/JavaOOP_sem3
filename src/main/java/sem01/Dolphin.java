package sem01;

import clinic.Swimable;

import java.time.LocalDate;
import java.util.List;

public class Dolphin extends Animal implements Swimable {
    public Dolphin(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color, double speed) {
        super(name, weight, owner, birthDay, vaccinations, color, speed);
    }

    public Dolphin(String name) {
        super(name);
    }

    public Dolphin(String name, double speed) {
        super(name, speed);
    }

    @Override
    protected void toGo() {
        System.out.printf("%s по кличке %s %s%n", this.TYPE, this.getName(), "Не бегает!");
    }

    @Override
    public void getSwimSpeed() {
        System.out.printf("%s по кличке '%s' плавает в океане со скоростью %.1f%n", this.TYPE, this.getName(), this.getSpeed());
    }
}
