package ObserverExercise;

import java.time.LocalDate;

public class client {
        public static void main(String[] args) {
                // Create flights
                Flight flight1 = new Flight("Chi", "SFO", LocalDate.of(2022, 12, 15), LocalDate.of(2022, 12, 26), 420);
                Flight flight2 = new Flight("DTW", "NYC", LocalDate.of(2023, 2, 3), LocalDate.of(2023, 2, 10), 240);
                Flight flight3 = new Flight("FLL", "DFW", LocalDate.of(2023, 4, 23), LocalDate.of(2023, 4, 28), 200);

                // Create buyers (observers)
                Observer johnFlight1 = new ConcreteObserver("John", "Chi", "SFO", LocalDate.of(2022, 12, 15),
                                LocalDate.of(2022, 12, 26),
                                350);
                Observer johnFlight2 = new ConcreteObserver("John", "DTW", "NYC", LocalDate.of(2023, 2, 3),
                                LocalDate.of(2023, 2, 10),
                                200);
                Observer mariaFlight2 = new ConcreteObserver("Maria", "DTW", "NYC", LocalDate.of(2023, 2, 3),
                                LocalDate.of(2023, 2, 10),
                                220);
                Observer mariaFlight3 = new ConcreteObserver("Maria", "FLL", "DFW", LocalDate.of(2023, 4, 23),
                                LocalDate.of(2023, 4, 28),
                                180);

                // Register buyers with flights
                flight1.registerObserver(johnFlight1);
                flight2.registerObserver(johnFlight2);
                flight2.registerObserver(mariaFlight2);
                flight3.registerObserver(mariaFlight3);

                // Simulate price change
                flight1.setPrice(400);
                flight2.setPrice(230);
                flight3.setPrice(190);
        }
}
