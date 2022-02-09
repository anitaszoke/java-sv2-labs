package activity;

public enum ActivityType {
    BIKING(1), HIKING(2), RUNNING(3), BASKETBALL(4);

    private final int order;

    ActivityType(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }
}