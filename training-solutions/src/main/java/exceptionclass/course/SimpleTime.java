package exceptionclass.course;

public class SimpleTime {

    private int hour;
    private int min;

    public SimpleTime(int hour, int min) {
        if ((hour == 0) || (min == 0)) {
            throw new InvalidTimeException("Time is null");
        }
        set(this.hour, this.min);
    }

    public SimpleTime(String timeString) {
        if (timeString == null) {
            throw new InvalidTimeException("Time is null");
        }
        if (!(timeString.substring(2).equals(":")) && !(timeString.length() == 5)) {
            throw new InvalidTimeException("Time is not hh:mm");
        }
        if (Integer.parseInt(timeString.substring(0, 2)) > 23 || Integer.parseInt(timeString.substring(0, 2)) < 0) {
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if (Integer.parseInt(timeString.substring(3, 5)) > 59 || Integer.parseInt(timeString.substring(3, 5)) < 0) {
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        set(this.hour, this.min);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    private String set(int hour, int min) {
        return (hour + ":" + min);
    }

    private String timeString(String timeString) {
        return String.format("%02d:%02d", this.hour, this.min);
    }
}
