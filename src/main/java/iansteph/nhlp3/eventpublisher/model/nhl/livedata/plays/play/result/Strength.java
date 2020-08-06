package iansteph.nhlp3.eventpublisher.model.nhl.livedata.plays.play.result;

import java.util.Objects;

public class Strength {

    private String code;
    private String name;

    public String getCode() {

        return code;
    }

    public void setCode(final String code) {

        this.code = code;
    }

    public String getName() {

        return name;
    }

    public void setName(final String name) {

        this.name = name;
    }

    @Override
    public String toString() {

        return "Strength{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Strength strength = (Strength) o;
        return Objects.equals(code, strength.code) &&
                Objects.equals(name, strength.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(code, name);
    }
}
