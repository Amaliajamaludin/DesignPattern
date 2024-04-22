package ObserverExercise;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Flight {
    private List<Observer> observers = new ArrayList<>();
    private String fromCity;
    private String toCity;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private double price;

    public Flight(String fromCity, String toCity, LocalDate departureDate, LocalDate returnDate, double price) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.price = price;
    }

    public String getFromCity() {
        return fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public double getPrice() {
        return price;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}
