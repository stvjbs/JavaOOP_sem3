package sem01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Owner alex = new Owner("Alexey");
        Vaccination chumka = new Vaccination("chumka", LocalDate.of(2010, 12, 5));
        Vaccination rabbish = new Vaccination("rabbish", LocalDate.of(2015, 10, 7));

        Animal barsik = new Cat("barsik", 10.0, alex, LocalDate.now(), List.of(chumka), Color.BLACK, 25.0, "siamskiy");
        Dog barbos = new Dog("barbos", 10.0, alex, LocalDate.now(), List.of(chumka, rabbish), Color.WHITE, 35.0);
        Caterpillar joe = new Caterpillar ("joe");
        Crocodile gena = new Crocodile("gena");
        Dolphin flipper = new Dolphin("flipper");
        Eagle hercules = new Eagle("hercules", 30.0);
        Ostrich nick = new Ostrich("nick");


        System.out.println("---------");
        barsik.toFly();
        barsik.toSwim();
        barsik.toGo();
        System.out.println("---------");
        barbos.toFly();
        barbos.toSwim();
        barbos.toGo();
        System.out.println("---------");
        joe.toFly();
        joe.toSwim();
        joe.toGo();
        System.out.println("---------");
        gena.toFly();
        gena.toSwim();
        gena.toGo();
        System.out.println("---------");
        flipper.toFly();
        flipper.toSwim();
        flipper.toGo();
        System.out.println("---------");
        hercules.toFly();
        hercules.toSwim();
        hercules.toGo();
        System.out.println("---------");
        nick.toFly();
        nick.toSwim();
        nick.toGo();

        barbos.lifeCycle();



//        System.out.println(barsik.getName());
//        System.out.println(barsik.getVaccinations());

//        barsik.setVaccinations(List.of(chumka, new Vaccination("столбняк", LocalDate.of(2015, 11, 5))));
//        System.out.println(barsik.getVaccinations());


        List<Animal> ourAnimals = new ArrayList<>();

//        ourAnimals.add(barsik);
//        ourAnimals.add(barbos);
//        ourAnimals.add(flipper);
//        for (Animal animal:ourAnimals) {
//            System.out.println(animal.getName());
//             }

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