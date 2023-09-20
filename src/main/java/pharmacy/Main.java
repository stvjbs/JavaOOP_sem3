package pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pharmacy catPharmacy = new CatPharmacy();
        Component pen = new Penicilium("5 мг");
        pen.setWeight("7 мг");
        catPharmacy.addComponent(new Azitronitum("12 мг"))
                .addComponent(new Water("10 мл"))
                .addComponent(pen);
        Pharmacy catPharmacy1 = new CatPharmacy();

        catPharmacy1.addComponent(new Azitronitum("15 мг"))
                .addComponent(pen);

        Pharmacy catPharmacy2 = new CatPharmacy();

        catPharmacy2.addComponent(new Azitronitum("15 мг"))
                .addComponent(new Water("12 мл"));

        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(catPharmacy2);
        pharmacyList.add(catPharmacy);
        pharmacyList.add(catPharmacy1);
//        System.out.println(pharmacyList);

        for (Pharmacy p : pharmacyList) {
            System.out.println(p.getFullPower());
        }
        Collections.sort(pharmacyList);
        System.out.println("-------------------");
        for (Pharmacy p : pharmacyList) {
            System.out.println(p.getFullPower());
        }

//        while (((Iterator<Component>) catPharmacy).hasNext()) {
//            System.out.println(((Iterator<Component>) catPharmacy).next());
//        }
        for (Component component : catPharmacy) {
            System.out.println(component);
        }
    }
}
