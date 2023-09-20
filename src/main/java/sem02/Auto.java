package sem02;

import java.util.List;

public class Auto extends Mechanism implements Rideable, Turnable {

    public Auto(List<Detail> details) {
        super(details);
    }

    @Override
    public void manage() {
        // описываем конкретную реализауию метода для данного класса
        System.out.println("Завёл и поехал");
    }

    @Override
    public void ride() {
        System.out.println("Поехали");
    }

    @Override
    public void turnOn() {
        System.out.println("Старт");
    }

    @Override
    public void turnOff() {
        System.out.println("Стоп");
//        int a = 3;
//        long b = 3;
//        y(b);
    }

    @Override
    public double some() {
        return 25;
    }


}
