import java.util.HashMap;
import java.util.Map;

public class RatingSystem {
    private Map<Vehicle, Integer> vehicleRatings;
    private Map<Customer, Integer> customerRatings;

    public RatingSystem() {
        vehicleRatings = new HashMap<>();
        customerRatings = new HashMap<>();
    }

    public void rateVehicle(Vehicle vehicle, int rating) {
        vehicleRatings.put(vehicle, rating);
    }

    public void rateCustomer(Customer customer, int rating) {
        customerRatings.put(customer, rating);
    }

    public Integer getVehicleRating(Vehicle vehicle) {
        return vehicleRatings.get(vehicle);
    }

    public Integer getCustomerRating(Customer customer) {
        return customerRatings.get(customer);
    }
}