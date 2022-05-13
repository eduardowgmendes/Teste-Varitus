package questao2;

import java.util.List;
import java.util.Objects;

public class Alumni {

    private String name;
    private List<Double> notes;

    public Alumni(String name, List<Double> notes) {
        this.name = name;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getNotes() {
        return notes;
    }

    public void setNotes(List<Double> notes) {
        this.notes = notes;
    }

    public double media() {
        return getNotes().get(0) + getNotes().get(1) + getNotes().get(2) / getNotes().size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumni alumni = (Alumni) o;
        return Objects.equals(name, alumni.name) && Objects.equals(notes, alumni.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, notes);
    }

    @Override
    public String toString() {
        return String.format("\nName: %s\nNote: %s\n", name, notes);
    }

}
