package sem01;

import clinic.Flyable;

import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Flyable {
    public Eagle(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color, double speed) {
        super(name, weight, owner, birthDay, vaccinations, color, speed);
    }

    public Eagle(String name, double speed) {
        super (name, speed);
    }
    @Override
    protected void toSwim() {
        System.out.printf("%s по кличке %s %s%n", this.TYPE, this.getName(), "Не плавает!");
    }

    @Override
    public void getFlySpeed() {
        double s = this.getSpeed();
        System.out.printf("%s по кличке '%s' улетает в тёплые края со скоростью %.1f%n", this.TYPE, this.getName(), s);
    }

}
