abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
 
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
 
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
 
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }
}

class RideService {
    public static double calculateFareForVehicle(Vehicle vehicle, double distance) {
        return vehicle.calculateFare(distance);
    }

    public static void main(String[] args) {
        Vehicle car = new Car("C123", "Rashi", 10.0);
        Vehicle bike = new Bike("B456", "Riya", 5.0);
        Vehicle auto = new Auto("A789", "Shaan", 7.0);

        double carFare = calculateFareForVehicle(car, 15);
        double bikeFare = calculateFareForVehicle(bike, 15);
        double autoFare = calculateFareForVehicle(auto, 15);

        System.out.println("Car Fare: " + carFare);
        System.out.println("Bike Fare: " + bikeFare);
        System.out.println("Auto Fare: " + autoFare);
    }
}
