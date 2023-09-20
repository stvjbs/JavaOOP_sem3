package sem01;

import java.time.LocalDate;

public class Vaccination {
    private String title;
    private LocalDate vaccinationDate;

    public Vaccination(String title, LocalDate vaccinationDate) {
        this.title = title;
        this.vaccinationDate = vaccinationDate;
    }

    @Override //переопределение метода
    public String toString() {
        return String.format("Прививка: %s, %s%n", title, vaccinationDate);
    }
}