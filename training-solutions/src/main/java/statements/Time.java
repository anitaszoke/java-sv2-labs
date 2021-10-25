package statements;

public class Time {
    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;

    }
    private int sixty = 60;

    public int getInMinutes() {
        return sixty * hour + min;
    }
    public int getInSeconds(){
        return getInMinutes() * sixty + sec;
    }

    public boolean earlierThan(Time another) {
        int thisTimeSec = this.getInSeconds();
        int anotherTimeSec = another.getInSeconds();
        return thisTimeSec < anotherTimeSec;
    }
    public String toString() {
        return hour + ":" + min + ":" + sec;

    }
}
