package clinic;

import sem01.Animal;

import java.util.ArrayList;
import java.util.List;

public final class VetClinic {
    private List<Animal> patients;

    public VetClinic(List<Animal> patients) {
        this.patients = patients;
    }
    public void addAnimal (Animal animal) {
        patients.add(animal);
    }

    public List<Animal> getPatients() {
        return patients;
    }

    public void getRunAnimal () {
        List <Animal> runAnimal = new ArrayList<>();
        for (Animal animal : this.patients)
            if (animal instanceof Runable) {
                runAnimal.add(animal);
            }
        System.out.println("Список бегающих животных:");
        System.out.println(runAnimal);
    }

    public void getFlyAnimal () {
        List <Animal> flyAnimal = new ArrayList<>();
        for (Animal animal : this.patients)
            if (animal instanceof Flyable) {
                flyAnimal.add(animal);
            }
        System.out.println("Список летающих животных:");
        System.out.println(flyAnimal);
    }

    public void getSwimAnimal () {
        List <Animal> swimAnimal = new ArrayList<>();
        for (Animal animal : this.patients)
            if (animal instanceof Swimable) {
                swimAnimal.add(animal);
            }
        System.out.println("Список плавающих животных:");
        System.out.println(swimAnimal);
    }

}



