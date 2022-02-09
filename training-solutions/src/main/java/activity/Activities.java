package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private final List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        List<Report> distancesByTypesReport = new ArrayList<>();

        double bikingDistance = getTypeDistance(ActivityType.BIKING);
        double hikingDistance = getTypeDistance(ActivityType.HIKING);
        double runningDistance = getTypeDistance(ActivityType.RUNNING);
        double basketballDistance = getTypeDistance(ActivityType.BASKETBALL);

        distancesByTypesReport.add(new Report(ActivityType.BIKING, bikingDistance));
        distancesByTypesReport.add(new Report(ActivityType.HIKING, hikingDistance));
        distancesByTypesReport.add(new Report(ActivityType.RUNNING, runningDistance));
        distancesByTypesReport.add(new Report(ActivityType.BASKETBALL, basketballDistance));

        return distancesByTypesReport;
    }

    public int numberOfTrackActivities() {
        return (int) activities.stream()
                .filter(ActivityWithTrack.class::isInstance)
                .count();
/*
        int count = 0;
        for (Activity a : activities) {
            if (a instanceof ActivityWithTrack) {
                count++;
            }
        }
        return count;
 */
    }

    public int numberOfWithoutTrackActivities() {
        return (int) activities.stream()
                .filter(ActivityWithoutTrack.class::isInstance)
                .count();

/*
        int count = 0;
        for (Activity a : activities) {
            if (a instanceof ActivityWithoutTrack) {
                count++;
            }
        }
        return count;
 */
    }

    private double getTypeDistance(ActivityType type) {
        return activities.stream()
                .filter(a -> a.getType().equals(type))
                .mapToDouble(Activity::getDistance)
                .sum();

/*
        double sum = 0;
        for (Activity a : activities) {
            if (a.getType().equals(type)) {
                sum += a.getDistance();
            }
        }
        return sum;
 */
    }
}