package collectionsiterator.online;

import java.time.LocalDateTime;

public class OnlineLesson {
    private String name;
    private String subject;
    private LocalDateTime beginTime;

    public OnlineLesson(String name, String subject, LocalDateTime beginTime) {
        this.name = name;
        this.subject = subject;
        this.beginTime = beginTime;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }
}
