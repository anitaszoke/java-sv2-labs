package activity;

public class Coordinate {

    private final double latitude;

    private final double longitude;

    public Coordinate(double latitude, double longitude) {
        checkingLatitude(latitude);
        checkingLongitude(longitude);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private void checkingLatitude(double latitude) {
        if (latitude < (-90) || latitude > 90) {
            throw new IllegalArgumentException("Latitude must be between -90 and 90");
        }
    }

    private void checkingLongitude(double longitude) {
        if (longitude < (-180) || longitude > 180) {
            throw new IllegalArgumentException("Longitude must be between -180 and 180");
        }
    }
}