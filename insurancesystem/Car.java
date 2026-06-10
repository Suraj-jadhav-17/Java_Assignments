package assignments.insurancesystem;

public class Car extends Vehicle{

    public Car(String vehicleNumber, String ownerName, double price, int year,int airBagCount) {
        super(vehicleNumber, ownerName, price, year, airBagCount);

    }
    @Override
    public double  calculateInsurance() {
        return getPrice()*0.04;
    }

    @Override
    public double calculateRoadTax() {
        return getPrice()*0.08;
    }
}
