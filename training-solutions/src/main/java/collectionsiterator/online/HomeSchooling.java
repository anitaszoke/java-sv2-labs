package collectionsiterator.online;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {

    private List<OnlineLesson> lessons = new ArrayList<>();

    public List<OnlineLesson> getLessons() {
        return new ArrayList<>(lessons);
    }

    public void addNewLesson(OnlineLesson lesson) {
        int index = lessons.size();
        for (int i = 0; i < lessons.size()-1; i++) {
            if (lessons.get(i).getBeginTime().isBefore(lesson.getBeginTime()) && lessons.get(i + 1).getBeginTime().isAfter(lesson.getBeginTime())) {
                index = i+1;
            }
        }
        lessons.add(index,lesson);
    }

    public List<OnlineLesson> getLessonsByTitle(String subject) {
        List<OnlineLesson> subjects = new ArrayList<>();
        Iterator<OnlineLesson> iterator = lessons.listIterator();
        while (iterator.hasNext()) {
            OnlineLesson lesson = iterator.next();
            if(lesson.getSubject().equals(subject)) {
                subjects.add(lesson);
            }
        }
        return subjects;
    }

    public void removeLesson(LocalDateTime beginTime) {
        Iterator<OnlineLesson> iterator = lessons.listIterator();
        while (iterator.hasNext()) {
            OnlineLesson lesson = iterator.next();
            if (lesson.getBeginTime().equals(beginTime)) {
                lesson = iterator.next();
                lessons.remove(lesson);
            }

        }
    }


}
