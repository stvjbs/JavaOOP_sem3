package Sem01;

import java.time.LocalDate;
import java.util.List;

public class Crocodile extends Animal{
    public Crocodile(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }

    public Crocodile(String name) {
        super(name);
    }
}
