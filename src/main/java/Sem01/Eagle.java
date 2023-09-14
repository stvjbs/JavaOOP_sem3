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
}
