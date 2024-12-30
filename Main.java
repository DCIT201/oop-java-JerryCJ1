public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();
        Vehicle car = new Car("C001", "Toyota Camry", 50);
        Vehicle motorcycle = new Motorcycle("M001", "Harley Davidson", 30);
        Vehicle truck = new Truck("T001", "Ford F-150", 80);

        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        Customer customer = new Customer("CUST001", "John Doe");

        try {
            agency.processRental(customer, car, 3);
            System.out.println("Total cost: " + customer.getRentalHistory().get(0).getTotalCost());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        RatingSystem ratingSystem = new RatingSystem();
        ratingSystem.rateVehicle(car, 5);
        ratingSystem.rateCustomer(customer, 4);

        System.out.println("Vehicle Rating: " + ratingSystem.getVehicleRating(car));
        System.out.println("Customer Rating: " + ratingSystem.getCustomerRating(customer));
    }
}
