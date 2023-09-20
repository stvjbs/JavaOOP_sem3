package sem02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //слева Абстракция = справа конкретная реализация, которая у нас написана ранее в классе Auto
        Mechanism car = new Auto(new ArrayList<>());

        //слева Абстракция = справа конкретная реализация, которая тут же пишем ниже
        Mechanism mechanism = new Mechanism(new ArrayList<>()) { // создание анонимного класса
            @Override
            public void manage() {
            }
        };
       // Перемеменная squareArea типа AreaCalculation задаём через анонимный класс
        AreaCalculation squareArea = new AreaCalculation() {
            @Override
            public double calculation(double[] args) {
                return args[0]* args[0]; // переопределяем метод для поиска площади квадрата
            }
        };
        // тоже самое но ввиде лямбды
        AreaCalculation squareArea1 = arg -> arg[0]* arg[0]; // Анонимный класс

        double [] doubles = new double[] {7};
        System.out.println("Площадь квадрата = " + squareArea1.calculation(doubles));

        AreaCalculation squareArea2 = x -> { // наш массив принимает метод calculation
            // если реализации более одной строчки, то необходимы {} и внутри них return
            return x[0] * x[0];
        };
        // если у нас в методе в функциональном интерфейсе нет аргументов, то ставятся просто скобки и сразу реализация
        // AreaCalculation squareArea3 = () -> 2 * 2;

        // если у нас в методе в функциональном интерфейсе 2 аргумента, то реализация будет вида:
        // AreaCalculation squareArea4 = (x, y) -> x[0] * x[0] * y[0];


        AreaCalculation squareTriangle = ar -> 0.5 * ar[0]* ar[1]; // Анонимный класс

        double [] doubles1 = new double[] {7, 5};
        System.out.println("Площадь треугольника  = " + squareTriangle.calculation(doubles1));

    }
}
