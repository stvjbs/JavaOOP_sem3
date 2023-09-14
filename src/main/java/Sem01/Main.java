package Sem01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner alex = new Owner("Alexey");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));
        Vaccination rabbish = new Vaccination("rabbish", LocalDate.of(2015, 10, 7));

        Animal barsik = new Cat("barsik", 10.0, alex, LocalDate.now(), List.of(chumka), Color.BLACK, "siamskiy");
        Dog barbos = new Dog("barbos", 10.0, alex, LocalDate.now(), List.of(chumka), Color.WHITE);
        Caterpillar joe = new Caterpillar ("joe");
        Crocodile gena = new Crocodile("gena");
        Dolphin flipper = new Dolphin("flipper");
        Eagle hercules = new Eagle("hercules");
        Ostrich nick = new Ostrich("nick");

        nick.toFly();
        barsik.toFly();



//        System.out.println(barsik.getName());
//        System.out.println(barsik.getVaccinations());

//        barsik.setVaccinations(List.of(chumka, new Vaccination("столбняк", LocalDate.of(2015, 11, 5))));
//        System.out.println(barsik.getVaccinations());


//        List<Animal> ourAnimals = new ArrayList<>();
//
//        ourAnimals.add(barsik);
//        ourAnimals.add(barbos);
//        for (Animal animal : ourAnimals) {
//            if (animal instanceof Cat) {
//                System.out.println(((Cat) animal).getBreed());
//            }
//            System.out.println(animal.getName());
//        }
//        ((Cat) barsik).getBreed();
//        barbos.eat();
//        barsik.wakeUp();
//        barsik.findFood();
//        barsik.toPlay();
//        barsik.goToSleep();
//        barsik.lifeCycle();

    }
}