package pharmacy;

import java.util.*;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    public String name;
    private List<Component> components;
    private int index;

    public List<Component> getComponents() {
        return components;
    }

    public String getNameOfFarmacy() {
        return name;
    }

    public Pharmacy(String name) {
        this.components = new ArrayList<>(); // инъекция - отложенная инициализация
        this.index = 0;
        this.name = name;
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
        return count;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "name='" + name + '\'' +
                ", components=" + components +
                '}';
    }

    @Override
    public Iterator<Component> iterator() {
        return new PharmacyIterator(components);
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
        if (this.getNameOfFarmacy().hashCode() > o.getNameOfFarmacy().hashCode()) {
            return 1;
        }
        if (this.getNameOfFarmacy().hashCode() < o.getNameOfFarmacy().hashCode()) {
            return -1;
        } else return 0;
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
}


