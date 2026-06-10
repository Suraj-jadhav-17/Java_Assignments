package assignments.insurancesystem;

public class Truck extends Vehicle {
    public Truck(String vehicleNumber, String ownerName, double price, int year,int airBagCount) {
        super(vehicleNumber, ownerName, price, year, airBagCount);
    }

    @Override
    public double calculateInsurance() {
        return getPrice()*0.06;
    }

    @Override
    public double calculateRoadTax() {
        return getPrice()*0.1;
    }
}
