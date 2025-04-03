package praktic.inheritance.transportation;

public class Train extends Vehicle {
    public Train(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    @Override
    public int calculateFare() {
        return 10000;
    }
}