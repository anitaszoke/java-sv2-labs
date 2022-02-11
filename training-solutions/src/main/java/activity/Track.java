package activity;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
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
        checkingTrackPoints();
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
        checkingTrackPoints();
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
        checkingTrackPoints();
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
        checkingTrackPoints();
        double minLatitude = findMinLatitude();
        double minLongitude = findMinLongitude();

        return new Coordinate(minLatitude, minLongitude);
    }

    public Coordinate findMaximumCoordinate() {
        checkingTrackPoints();
        double maxLatitude = findMaxLatitude();
        double maxLongitude = findMaxLongitude();

        return new Coordinate(maxLatitude, maxLongitude);
    }

    public double getRectangleArea() {
        double latitude = findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude();
        double longitude = findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude();

        return latitude * longitude;
    }

    private void checkingTrackPoints() {
        if (trackPoints.isEmpty()) {
            throw new NullPointerException("Trackpoints list can not be empty!");
        }
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

    public void loadFromGpx(Path path) {
        String line;
        List<Coordinate> coordinates = new ArrayList<>();
        List<Double> elevations = new ArrayList<>();

        try {
            try (BufferedReader reader = Files.newBufferedReader(path)) {
                while ((line = reader.readLine()) != null) {

                    if (line.contains("<trkpt")) {

                        coordinates.add(createCoordinate(line));
                    }
                    if (line.contains("<ele>")) {

                        elevations.add(createElevation(line));
                    }

                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Error by parsing, general io", ioe);
        }

        for (int i = 0; i < coordinates.size(); i++) {
            addTrackPoint(new TrackPoint(coordinates.get(i), elevations.get(i)));
        }
    }

    private double createElevation(String line) {
        String[] elevationWith = line.split(">");
        String[] elevation = elevationWith[1].split("<");
        String elevationOnly = elevation[0];

        return Double.parseDouble(elevationOnly);
    }

    private Coordinate createCoordinate(String line) {
        String[] latBefore = line.split("lat=\"");
        String[] latAfter = latBefore[1].split("\" lon=\"");
        String lat = latAfter[0];
        String[] lonAfter = latAfter[1].split("\">");
        String lon = lonAfter[0];

        double latitude = Double.parseDouble(lat);
        double longitude = Double.parseDouble(lon);

        return new Coordinate(latitude, longitude);
    }
}