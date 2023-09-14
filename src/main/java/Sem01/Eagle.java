package Sem01;

import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal {
    public Eagle(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    public Eagle(String name) {
        super(name);
    }
    @Override
    protected void toSwim() {
        System.out.printf("%s по кличке %s %s%n", this.TYPE, this.getName(), "Не плавает!");
    }
}
