package clinic;

import sem01.Animal;

public class Nurse extends Staff {

    public Nurse(String name, String position) {
        super(name, position);
    }

    @Override
    public void registration(Animal animal) {
        System.out.printf("%s %s регистрирует пациента: %s - %s и перенаправляет его на приём к врачу.%n",this.getPosition(),
                this.getName(), animal.getName(), animal.getTYPE());
    }

    public void writeCard (Animal animal) {
        System.out.printf("%s %s заполняет карточку нового пациента: %s %s - и помогает врачу с осмотром.%n",this.getPosition(),
                this.getName(), animal.getTYPE(), animal.getName());
    }
}

