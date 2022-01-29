package virtualmethod.demo;

import java.util.List;

public class Trainer extends Human {

    private List<Course> courses;


    public Trainer(String name, List<Course> courses) {
        super(name);
        this.courses = courses;
    }
//ha negatív akkor 0-át ad vissza, meghívja a human osztályban lévő metódust super.getDefaultFreeTime
    @Override
    public int getDefaultFreeTime() {
        return Math.max(super.getDefaultFreeTime() - courses.size(), 0);
    }
}
