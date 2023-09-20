package sem02;

@FunctionalInterface
public interface AreaCalculation {
    default void x() {
    } // таких деволтных методов (с реализацией) может быть мнодество в вукциональном интерфейсе

    default void y() {
    } // таких деволтных методов (с реализацией) может быть мнодество в вукциональном интерфейсе

    double calculation(double[] args); // или double calculation(double... args);

    // если у нас в методе нет аргументов то ставятся просто скобки:
    // double calculation ();

    // если у нас в методе 2 аргумента:
    // double calculation(double[] args, double[] kwargs);

}
