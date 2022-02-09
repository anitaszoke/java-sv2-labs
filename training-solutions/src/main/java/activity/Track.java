package activity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Track {

    private final List<TrackPoint> trackPoints = new ArrayList<>();

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public double getFullElevation() {
        List<Double> elevations = createElevationsList();


        return IntStream.range(0, elevations.size() - 1)
                .filter(i -> elevations.get(i) < elevations.get(i + 1))
                .mapToDouble(i -> elevations.get(i + 1) - elevations.get(i))
                .sum();

/*
        double count = 0;
        int i = 0;

        while (i < elevations.size() - 1) {
            if (elevations.get(i) < elevations.get(i + 1)) {
                count += elevations.get(i + 1) - elevations.get(i);
            }
            i++;
        }

        for (int i = 0; i < elevations.size() - 1; i++) {
            if (elevations.get(i) < elevations.get(i + 1)) {
                count += elevations.get(i + 1) - elevations.get(i);
            }
        }

        return count;

 */
    }

    public double getFullDecrease() {
        List<Double> elevations = createElevationsList();

        return IntStream.range(0, elevations.size() - 1)
                .filter(i -> elevations.get(i) > elevations.get(i + 1))
                .mapToDouble(i -> elevations.get(i + 1) + elevations.get(i))
                .sum();

/*        double count = 0;
        int i = 0;

        while (i < elevations.size() - 1) {
            if (elevations.get(i) > elevations.get(i + 1)) {
                count += elevations.get(i + 1) + elevations.get(i);
            }
            i++;
        }
        return count;
*/

/*        double count = 0;
        for (int i = 0; i < elevations.size() - 1; i++) {
            if (elevations.get(i) > elevations.get(i + 1)) {
                count += elevations.get(i + 1) + elevations.get(i);
            }
        }

        return count;
*/

    }

    public double getDistance() {
        return IntStream.range(1, trackPoints.size())
                .mapToDouble(i -> trackPoints.get(i - 1).getDistanceFrom(trackPoints.get(i)))
                .sum();

/*
        double distance = 0;
        int i = 1;
        while (i < trackPoints.size()) {
            distance += trackPoints.get(i - 1).getDistanceFrom(trackPoints.get(i));
            i++;
        }
        return distance;
*/

/*
        double distance = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            distance += trackPoints.get(i - 1).getDistanceFrom(trackPoints.get(i));
        }
        return distance;
*/
    }

    public Coordinate findMinimumCoordinate() {
        double minLatitude = findMinLatitude();
        double minLongitude = findMinLongitude();

        return new Coordinate(minLatitude, minLongitude);
    }

    public Coordinate findMaximumCoordinate() {
        double maxLatitude = findMaxLatitude();
        double maxLongitude = findMaxLongitude();

        return new Coordinate(maxLatitude, maxLongitude);
    }

    public double getRectangleArea() {
        double latitude = findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude();
        double longitude = findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude();

        return latitude * longitude;
    }


    private List<Double> createElevationsList() {
        return trackPoints.stream()
                .map(TrackPoint::getElevation)
                .toList();
    }

    private double findMinLatitude() {
        double minLatitude = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i).getCoordinate().getLatitude() < trackPoints.get(i + 1).getCoordinate().getLatitude()) {
                minLatitude = trackPoints.get(i).getCoordinate().getLatitude();
            }
        }
        return minLatitude;
    }

    private double findMinLongitude() {
        double minLongitude = 0;

        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i).getCoordinate().getLongitude() > trackPoints.get(i + 1).getCoordinate().getLongitude()) {
                minLongitude = trackPoints.get(i + 1).getCoordinate().getLongitude();
            }
        }
        return minLongitude;
    }

    private double findMaxLatitude() {
        double maxLatitude = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i).getCoordinate().getLatitude() > trackPoints.get(i + 1).getCoordinate().getLatitude()) {
                maxLatitude = trackPoints.get(i).getCoordinate().getLatitude();
            }
        }
        return maxLatitude;
    }

    private double findMaxLongitude() {
        double maxLongitude = 0;

        for (int i = 0; i < trackPoints.size() - 1; i++) {
            if (trackPoints.get(i).getCoordinate().getLongitude() < trackPoints.get(i + 1).getCoordinate().getLongitude()) {
                maxLongitude = trackPoints.get(i + 1).getCoordinate().getLongitude();
            }
        }
        return maxLongitude;
    }
}