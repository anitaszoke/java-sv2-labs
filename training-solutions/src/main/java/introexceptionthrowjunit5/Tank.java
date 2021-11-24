package introexceptionthrowjunit5;

public class Tank {
    private int angle;

    public void modifyAngle(int angleNumber) {
        angle += angleNumber;
        while (angle < 0) {
            angle += 360;
        }
        while (angle > 360) {
            angle -= 360;
        }
        if (angle < 280 && angle > 80) {
            throw new IllegalArgumentException("Turret can not reach position!");
        }
    }

    public int getAngle() {
        return angle;
    }
}
