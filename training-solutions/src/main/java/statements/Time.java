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
    //Az earlierThan() metódus paraméterként egy másik Time típusú objektumot kap. Amennyiben az adott objektum által reprezentált időpont korábbi, mint a paraméterül kapott, igazat ad vissza, különben hamisat. Használd a már elkészített metódusokat!
    //public boolean earlierThan(Time another) {
    //    return ;
    //}
    public String toString() {
        return hour + ":" + min + ":" + sec;

    }
}
