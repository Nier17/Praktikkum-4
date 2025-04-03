package praktic.inheritance.transportation;

public abstract class Vehicle {
    protected String name;
    protected int capacity;
    protected int currentPassengers;
    protected String route;

    public Vehicle(String name, int capacity, String route) {
        this.name = name;
        this.capacity = capacity;
        this.route = route;
        this.currentPassengers = 0;
    }

    public abstract int calculateFare();

    public void startJourney() {
        System.out.println(name + " memulai perjalanan di rute: " + route);
    }

    public void stopJourney() {
        System.out.println(name + " telah mencapai tujuan akhir.");
    }

    public void boardPassenger(int number) {
        if (currentPassengers + number <= capacity) {
            currentPassengers += number;
            System.out.println(number + " penumpang naik. Total penumpang saat ini: " + currentPassengers);
        } else {
            System.out.println("Kapasitas maksimum tercapai. Tidak dapat menaikkan penumpang.");
        }
    }

    public void alightPassenger(int number) {
        if (currentPassengers - number >= 0) {
            currentPassengers -= number;
            System.out.println(number + " penumpang turun. Total penumpang saat ini: " + currentPassengers);
        } else {
            System.out.println("Jumlah penumpang tidak boleh negatif.");
        }
    }
}