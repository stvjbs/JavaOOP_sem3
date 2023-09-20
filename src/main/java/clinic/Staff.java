package clinic;

import sem01.Animal;

public abstract class Staff {
    private String name;
    private String position;

    public Staff(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public abstract void registration (Animal animal);

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

}
