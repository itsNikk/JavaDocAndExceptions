package Exceptions.Avatar;

public class Coordinata {
    private double latitude;
    private double longitude;

    public Coordinata() {
        setLatitude(0);
        setLongitude(0);
    }

    public Coordinata(double latitude, double longitude) {
        setLatitude(latitude);
        setLongitude(longitude);
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        if (latitude < -90.0 || latitude > 90.0) {
            throw new IllegalArgumentException("La latitudine deve essere compresa tra -90 e 90 gradi.");
        }
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        if (longitude < -180.0 || longitude > 180.0)
            throw new IllegalArgumentException("La longitudine deve essere compresa tra -180 e 180 gradi.");
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "(" + latitude + ", " + longitude + ")";
    }

    public Coordinata Add(int val) {
        return null;
    }
}
