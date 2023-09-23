package pharmacy;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        Pharmacy catPharmacy = new Pharmacy("Antibio");
        Pharmacy catPharmacy1 = new Pharmacy("Amoclav");
        Pharmacy catPharmacy2 = new Pharmacy("Augmentin");
        Pharmacy catPharmacy3 = new Pharmacy("Amoxiclav");
        Pharmacy catPharmacy4 = new Pharmacy("AmoxiciliniClavulani");
        Pharmacy catPharmacy5 = new Pharmacy("Amoxi");
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

        catPharmacy5.addComponent(new Azitronitum("4 мг")).addComponent(new Azitronitum("4 мг"))
                .addComponent(new Penicilium("3 мг")).addComponent(new Penicilium("3 мг"));


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

        Collections.sort(pharmacyList);
        for (Pharmacy pharmacy : pharmacyList) {
            System.out.println(pharmacy.getFullPower());
            System.out.println(pharmacy.getNameOfFarmacy());
        }
    }
}
