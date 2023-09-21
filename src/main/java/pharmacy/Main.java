package pharmacy;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Pharmacy catPharmacy = new CatPharmacy();
//        Pharmacy catPharmacy1 = new CatPharmacy();
//        Pharmacy catPharmacy2 = new CatPharmacy();
//        Pharmacy catPharmacy3 = new CatPharmacy();
//        Pharmacy catPharmacy4 = new CatPharmacy();
//        Pharmacy catPharmacy5 = new CatPharmacy();
        Pharmacy catPharmacy = new Pharmacy();
        Pharmacy catPharmacy1 = new Pharmacy();
        Pharmacy catPharmacy2 = new Pharmacy();
        Pharmacy catPharmacy3 = new Pharmacy();
        Pharmacy catPharmacy4 = new Pharmacy();
        Pharmacy catPharmacy5 = new Pharmacy();
        catPharmacy.addComponent(new Azitronitum("12 мг"))
                .addComponent(new Water("10 мл")).addComponent(new Penicilium("1 мг"));
        catPharmacy1.addComponent(new Azitronitum("12 мг"))
                .addComponent(new Water("10 мл")).addComponent(new Penicilium("1 мг"));

        catPharmacy2.addComponent(new Water("2 мл"))
                .addComponent(new Penicilium("3 мг"));

        catPharmacy3.addComponent(new Azitronitum("4 мг"))
                .addComponent(new Water("2 мл"));

        catPharmacy4.addComponent(new Azitronitum("1 мг"))
                .addComponent(new Water("4 мл")).addComponent(new Penicilium("12 мг"));

        catPharmacy5.addComponent(new Azitronitum("4 мг"))
                .addComponent(new Penicilium("3 мг"));


        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(catPharmacy);
        pharmacyList.add(catPharmacy1);
        pharmacyList.add(catPharmacy2);
        pharmacyList.add(catPharmacy3);
        pharmacyList.add(catPharmacy4);
        pharmacyList.add(catPharmacy5);
        System.out.println(pharmacyList.size());

        Set<Pharmacy> result = new HashSet<Pharmacy>(pharmacyList);
        System.out.println(result.size());

        //        System.out.println(pharmacyList);

//        for (Pharmacy p : pharmacyList) {
//            System.out.println(p.getFullPower());
//        }
//        Collections.sort(pharmacyList);
//        System.out.println("-------------------");
//        for (Pharmacy p : pharmacyList) {
//            System.out.println(p.getFullPower());
//            System.out.println(p);
//        }

//        while (((Iterator<Component>) catPharmacy).hasNext()) {
//            System.out.println(((Iterator<Component>) catPharmacy).next());
//        }
        for (Component c : catPharmacy1) {
            System.out.println();
        }
    }
}
