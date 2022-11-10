package PersonalFinance.model;

import PersonalFinance.exception.ModelException;

import java.util.Objects;

public class Arcticle extends Common {

    private String title;

    public Arcticle() {}

    public Arcticle(String title) {
        if (title.length() == 0) throw new ModelException(ModelException.TITLE_EMPTY);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Arcticle{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arcticle arcticle = (Arcticle) o;
        return title.equals(arcticle.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String getValueForComboBox() {
        return title;
    }
}
