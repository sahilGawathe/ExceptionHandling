package generics;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// Generic class for scheduling
class Schedule<T> {
    private List<T> items;

    public Schedule() {
        this.items = new ArrayList<>();
    }

    // Add a schedule item
    public void addItem(T item) {
        items.add(item);
    }

    // Remove a schedule item
    public void removeItem(T item) {
        items.remove(item);
    }

    // Get all schedule items
    public List<T> getItems() {
        return items;
    }

    // Find schedule items based on criteria (example: filtering by a property)
    public List<T> findItems(Criteria<T> criteria) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (criteria.matches(item)) {
                result.add(item);
            }
        }
        return result;
    }
}

// Functional interface for criteria
@FunctionalInterface
interface Criteria<T> {
    boolean matches(T item);
}

// Flight class
class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

    public Flight(String flightNumber, String origin, String destination, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return String.format("Flight[%s: %s -> %s, Departure: %s, Arrival: %s]",
                flightNumber, origin, destination, departureTime, arrivalTime);
    }
}

// Main class to demonstrate the system
public class FlightSchedulingSystem {
    public static void main(String[] args) {
        // Create a schedule for flights
        Schedule<Flight> flightSchedule = new Schedule<>();

        // Add some flights
        flightSchedule.addItem(new Flight("AA123", "New York", "Los Angeles",
                LocalDateTime.of(2025, 1, 10, 10, 0),
                LocalDateTime.of(2025, 1, 10, 14, 0)));

        flightSchedule.addItem(new Flight("BA456", "London", "Paris",
                LocalDateTime.of(2025, 1, 11, 9, 0),
                LocalDateTime.of(2025, 1, 11, 11, 0)));

        flightSchedule.addItem(new Flight("CA789", "Tokyo", "Sydney",
                LocalDateTime.of(2025, 1, 12, 20, 0),
                LocalDateTime.of(2025, 1, 13, 6, 0)));

        // Display all flights
        System.out.println("All Flights:");
        for (Flight flight : flightSchedule.getItems()) {
            System.out.println(flight);
        }

        // Find flights departing from a specific location
        System.out.println("\nFlights departing from 'London':");
        List<Flight> londonFlights = flightSchedule.findItems(flight -> flight.getOrigin().equalsIgnoreCase("London"));
        for (Flight flight : londonFlights) {
            System.out.println(flight);
        }

        // Remove a flight
        flightSchedule.removeItem(londonFlights.get(0));
        System.out.println("\nAfter removing London flight:");
        for (Flight flight : flightSchedule.getItems()) {
            System.out.println(flight);
        }
    }
}
