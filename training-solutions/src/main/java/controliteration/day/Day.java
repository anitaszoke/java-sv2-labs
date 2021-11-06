package controliteration.day;

import java.util.List;

public class Day {
    private List<Hour> hoursOfDay;

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }

    public void addHour(Hour hour) {
        hoursOfDay.add(hour);
    }

    public void setDayPeriod() {
        for (Hour number : hoursOfDay) {
            if (number.getHourNumber() > 6 && number.getHourNumber() < 22) {
                number.setPeriod(DayPeriod.DAYTIME);
            } else {
                number.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }
}
