package pharmacy;

import java.util.*;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private List<Component> components;


    public Pharmacy() {
        this.components = new ArrayList<>();

    }

    public Pharmacy addComponent(Component component) {
        if (component == null) throw new NullPointerException("Компонент не может быть NULL");
        components.add(component);
        return this;
    }

    public int getFullPower() {
        int count = 0;
        for (Component component : components) {
            count += component.getPower();
        }
//      int count = components.stream().mapToInt(Component::getPower).sum();
        return count;
    }

//    @Override
//    public boolean hasNext() {
//        return index < components.size();
//    }
//
//    @Override
//    public Component next() {
//        return components.get(index++);
//    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                '}';
    }
    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        List<Component> components = Collections.singletonList((Component) o);
        if (components.equals(this.components)) return true;
        return false;
    }



    @Override
    public Iterator<Component> iterator() {
        return new PharmacyIterator();
    }

    @Override
    public int compareTo(Pharmacy o) {
        int fullPower = getFullPower();
        if (this.getFullPower() > o.getFullPower()) {
            return 1;
        }
        if (this.getFullPower() < o.getFullPower()) {
            return -1;
        }
        return 0;
    }

//    @Override
//    public Iterator<Component> iterator() {
//        return new Iterator<Component>() {
//            @Override
//            public boolean hasNext() {
//                return index < components.size();
//            }
//
//            @Override
//            public Component next() {
//                return components.get(index++);
//            }
//        };
//    }

//    for (Iterator<Component> iterator = pharmacy.iterator(); iterator.hasNext();) {
//        Component c = iterator.next();
//    }

}

