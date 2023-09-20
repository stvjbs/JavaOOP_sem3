package sem01;

import clinic.Illable;

import java.time.LocalDate;
import java.util.List;
import clinic.Runable;
import clinic.Swimable;

public class Cat extends Animal implements Runable, Swimable {
    private String breed;

    public Cat(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color, double speed, String breed) {
        super(name, weight, owner, birthDay, null, color, speed);
        this.breed = breed;
    }


    public Cat(String name, double speed) {
        super(name, speed);
    }

    // getter
    public String getBreed() {
        return breed;
    }

    @Override
    public void getRunSpeed() {
        System.out.printf("%s по кличке '%s' убегает к хозяину со скоростью %.1f%n", this.TYPE, this.getName(), this.getSpeed());
    }

    @Override
    public void getSwimSpeed() {
        System.out.printf("%s по кличке '%s' плавает со скоростью %.1f%n", this.TYPE, this.getName(), this.getSpeed());
    }
}