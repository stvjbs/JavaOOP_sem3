package clinic;

import sem01.Animal;

public class Human extends Animal implements Illable {

    public Human(String name) {
        super(name);
    }

    @Override
    public void heal() {
        System.out.println("Доктор лечит " + this.TYPE);
    }
}
