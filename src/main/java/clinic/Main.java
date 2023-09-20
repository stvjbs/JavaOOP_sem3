package clinic;

import sem01.*;
import sem02.A;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Main {
    public static void main(String[] args) {
        Owner alex;

        Nurse alla = new Nurse("Алла", "Старшая медсестра");
        Nurse liza = new Nurse("Лиза", "Медсестра");
        Doctor egor = new Doctor("Егор", "Окулист", liza);
        Doctor ivan = new Doctor("Иван", "Хирург", alla);


        Animal barsik = new Cat("Барсик", 10.0, new Owner("Oleg"), LocalDate.now(),
                List.of(new Vaccination("rabbish", LocalDate.of(2015, 10, 7))),
                Color.BLACK, 10.5, "siamskiy");
        Animal sharik = new Dog("Шарик", 10.0, new Owner("Oleg"), LocalDate.now(),
                List.of(new Vaccination("rabbish", LocalDate.of(2015, 10, 6))),
                Color.BLACK, 11.1);
        Animal hercules = new Eagle("Геркулес", 30.0);
        Animal knopa = new Butterfly("Кнопочка", 8.0);
        Animal joe = new Caterpillar("Джо", 9.1);
        Animal gena = new Crocodile("Гена", 19.8);
        Animal flipper = new Dolphin("Флиппер", 55.0);
        Animal tom = new Ostrich("Том", 75.0);


        VetClinic vetclinic = new VetClinic(new ArrayList<>());
        vetclinic.addAnimal(new Human("Egor"));
        vetclinic.addAnimal(barsik);
        vetclinic.addAnimal(sharik);
        vetclinic.addAnimal(hercules);
        vetclinic.addAnimal(knopa);
        vetclinic.addAnimal(joe);
        vetclinic.addAnimal(gena);
        vetclinic.addAnimal(flipper);
        vetclinic.addAnimal(tom);

        System.out.println("---------");
        alla.registration(sharik);
        ivan.registration(gena);
        ivan.inspection(gena);

        System.out.println("---------");
        vetclinic.getRunAnimal();
        System.out.println("---------");
        vetclinic.getFlyAnimal();
        System.out.println("---------");
        vetclinic.getSwimAnimal();
        System.out.println("---------");


        for (Animal animal : vetclinic.getPatients()) {
            if (animal instanceof Runable) {
                ((Runable) animal).getRunSpeed();
            } else {
                System.out.printf("%s не бегает%n", animal.getTYPE());
            }
            if (animal instanceof Swimable) {
                ((Swimable) animal).getSwimSpeed();
            } else {
                System.out.printf("%s не плавает%n", animal.getTYPE());
            }
            if (animal instanceof Flyable) {
                ((Flyable) animal).getFlySpeed();
//                System.out.println(animal.getName());
//                System.out.println(animal.getSpeed());
            } else {
                System.out.printf("%s не летает%n", animal.getTYPE());
            }
//            animal.heal();
        }
    }

}

