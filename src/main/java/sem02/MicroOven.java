package sem02;

import java.util.List;

public class MicroOven extends Mechanism {
    public MicroOven(List<Detail> details) {
        super(details);
    }

    @Override
    public void manage() {
        // описываем конкретную реализауию метода для данного класса
        System.out.println("Нажал кнопку. Подогрел суп!");
    }
}
