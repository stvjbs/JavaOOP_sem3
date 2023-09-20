package sem02;

public interface Rideable { // Способлный ездить
    public static final double pi = 3.14; // Неизменяемы константы слова public static final можно не писать

    default double some () { // можно внутри интерфейса в методах прописать реализацию,
       return 5.0;    // но нужно обязательно словао default
   }

    public abstract void ride ();// по умолчанию все методы в интерфейсах public abstract - можно не писать
}
