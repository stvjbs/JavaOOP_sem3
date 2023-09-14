package Sem01;

import java.time.LocalDate;
import java.util.List;

public class Ostrich extends Animal {
    public Ostrich(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    public Ostrich(String name) {
        super(name);
    }
}
