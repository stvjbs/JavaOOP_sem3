package sem01;

import clinic.Flyable;

import java.time.LocalDate;
import java.util.List;

public class Butterfly extends Animal implements Flyable {
    public Butterfly(String name, double speed) {
        super(name, speed);
    }

    public Butterfly(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color, double speed) {
        super(name, weight, owner, birthDay, vaccinations, color, speed);
    }

    @Override
    public void getFlySpeed() {
        System.out.printf("%s по кличке '%s' улетает на другой цветок со скоростью %.1f%n", this.TYPE, this.getName(), this.getSpeed());
    }
}




