package praktic.inheritance.mains;

import praktic.inheritance.transportation.Bus;
import praktic.inheritance.transportation.Train;
import praktic.inheritance.transportation.Taxi;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("Bus", 50, "Terminal A - Terminal B");
        Train train = new Train("Kereta", 200, "Stasiun Kota - Stasiun Pusat");
        Taxi taxi = new Taxi("Taksi", 4, "Bandara - Hotel");

        bus.startJourney();
        bus.boardPassenger(30);
        bus.setStops(5);
        System.out.println("Tarif Bus: Rp" + bus.calculateFare());
        bus.alightPassenger(10);
        bus.stopJourney();

        train.startJourney();
        train.boardPassenger(150);
        System.out.println("Tarif Kereta: Rp" + train.calculateFare());
        train.alightPassenger(50);
        train.stopJourney();

        taxi.startJourney();
        taxi.boardPassenger(2);
        taxi.setDistance(10);
        System.out.println("Tarif Taksi: Rp" + taxi.calculateFare());
        taxi.alightPassenger(1);
        taxi.stopJourney();
    }
}