package sem02;

public class C implements A,B {

    @Override
    public void x() {
        // Object p = new Object();
        C p = new C (); // переменная p класса C
        ((A) p).x(); // или выбираем A
        ((B) p).x(); // или выбираем B
    }
}