package ObserverExercise;

import java.time.LocalDate;

public class ConcreteObserver implements Observer {
    private String name;
    private String fromCity;
    private String toCity;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private double expectedPrice;

    public ConcreteObserver(String name, String fromCity, String toCity, LocalDate departureDate, LocalDate returnDate,
            double expectedPrice) {
        this.name = name;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.expectedPrice = expectedPrice;
    }

    public void update(Flight flight) {
        if (flight.getFromCity().equals(fromCity) && flight.getToCity().equals(toCity) &&
                flight.getDepartureDate().equals(departureDate) && flight.getReturnDate().equals(returnDate)) {
            if (flight.getPrice() <= expectedPrice) {
                System.out.println(name + ", you have been notified! Flight price from " + fromCity + " to " + toCity +
                        " on " + departureDate + " - " + returnDate + " is now $" + flight.getPrice());
            }
        }
    }
}
