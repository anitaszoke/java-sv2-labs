package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {
    private List<FieldPoint> fieldPointList = new ArrayList<>();

    public List<FieldPoint> addFieldPoint() {
        return fieldPointList;
    }

    public void logFieldPoint(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {
        if (timeOfLogging == null) {
            throw new IllegalArgumentException("Time of logging can not null!");
        }
        for (FieldPoint f : fieldPointsToLog) {
            f.setTimeOfLogging(timeOfLogging);
            fieldPointList.add(f);
        }
    }
}