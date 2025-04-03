package praktic.inheritance.transportation;

public class Bus extends Vehicle {
    private int stops;

    public Bus(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    public void setStops(int stops) {
        this.stops = stops;
    }

    @Override
    public int calculateFare() {
        return stops * 2000;
    }
}