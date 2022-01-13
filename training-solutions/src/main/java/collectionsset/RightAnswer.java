package collectionsset;

import java.util.Objects;

public class RightAnswer {

    private String name;

    public RightAnswer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RightAnswer answer = (RightAnswer) obj;
        return name.equals(answer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}