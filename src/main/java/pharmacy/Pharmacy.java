package pharmacy;

import java.util.*;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private List<Component> components;
    int index = 0;
    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public Pharmacy() {
        this.components = new ArrayList<>();
        index = 0;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return pharmacy.components.equals(this.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components);
    }

//    @Override
//    public Iterator<Component> iterator() {
//        return new PharmacyIterator();
//    }

    @Override
    public int compareTo(Pharmacy o) {
        int fullPower = getFullPower();
        if (this.getFullPower() > o.getFullPower()) {
            return 1;
        }
        if (this.getFullPower() < o.getFullPower()) {
            return -1;
        }
        if (this.components.getClass().hashCode() > o.components.getClass().hashCode()){
            return 1;}
        if (this.components.getClass().hashCode() < o.components.getClass().hashCode()){
                return -1;}
        else return 0;

    }

    @Override
    public Iterator<Component> iterator() {

        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

//    for (Iterator<Component> iterator = pharmacy.iterator(); iterator.hasNext();) {
//        Component c = iterator.next();
//    }

}

