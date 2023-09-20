package sem01;

import clinic.Runable;

import java.time.LocalDate;
import java.util.List;

public class Caterpillar extends Animal implements Runable {
    public Caterpillar(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color, double speed) {
        super(name, weight, owner, birthDay, vaccinations, color, speed);
    }

    public Caterpillar(String name) {
        super(name);
    }

    public Caterpillar(String name, double speed) {
        super(name, speed);
    }

    @Override
    protected void toSwim() {
        System.out.printf("%s по кличке %s %s%n", this.TYPE, this.getName(), "Не плавает!");
    }

    @Override
    public void getRunSpeed() {
        System.out.printf("%s по кличке '%s' поедает лист со скоростью %.1f%n", this.TYPE, this.getName(), this.getSpeed());
    }

}
