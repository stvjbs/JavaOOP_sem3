package sem02;

import java.util.List;

public abstract class Mechanism {
    private List<Detail>details;

    public Mechanism(List<Detail> details) {
        this.details = details;
    }

    public abstract void manage ();

//    void y (int a) {}
//    void y (long a) {}

}
