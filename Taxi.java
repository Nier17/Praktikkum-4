package praktic.inheritance.transportation;

public class Taxi extends Vehicle {
    private int distance;

    public Taxi(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public int calculateFare() {
        return distance * 5000;
    }
}
