package assignments.insurancesystem;

public class Bike extends Vehicle{

    public Bike(String vehicleNumber, String ownerName, double price, int year,int airBagCount) {
        super(vehicleNumber, ownerName, price, year, airBagCount);
    }
    @Override
    public double calculateInsurance() {
        return getPrice()*0.02;
    }

    @Override
    public double calculateRoadTax() {
        return getPrice()*0.05;
    }
}
