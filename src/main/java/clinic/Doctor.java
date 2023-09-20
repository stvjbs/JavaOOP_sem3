package clinic;

import sem01.Animal;

public class Doctor extends Staff{
    private Nurse nurse;
    private int roomNumber;

    public Doctor(String name, String position) {
        super(name, position);
    }

    public Doctor(String name, String position, Nurse nurse) {
        super(name, position);
        this.nurse = nurse;
    }


    @Override
    public void registration(Animal animal) {
        System.out.printf("%s %s регистрирует пациента: %s - %s и начинает осмотр.%n",this.getPosition(),
                this.getName(), animal.getName(), animal.getTYPE());
    }

    public void inspection (Animal animal) {
        System.out.printf("%s %s во время осмотра пациента %s просит заполнить карту пациента.%n",this.getPosition(),
                this.getName(), animal.getName());
        this.getNurse().writeCard(animal);
    }
    public Nurse getNurse() {
        return nurse;
    }

    public int getRoomNumber() {
        return roomNumber;
    }


}
