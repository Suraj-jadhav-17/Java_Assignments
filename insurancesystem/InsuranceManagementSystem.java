package assignments.insurancesystem;

public class InsuranceManagementSystem {

    public static void main(String[] args) {
        Vehicle vehicle = new Car("MH12AB1234", "Suraj jadhav", 800000,2023,6);
        System.out.println("Insurance management system has been created");

        System.out.println("Vehicle details:");
        System.out.println("Vehicle type:"+vehicle.getClass().getSimpleName());
        System.out.println("Vehicle number:"+vehicle.getVehicleNumber());
        System.out.println("Vehicle price:"+vehicle.getPrice());
        System.out.println("vehicle year:"+vehicle.getYear());
        System.out.println("vehicle air bag count:"+vehicle.getAirBagCount());
        System.out.println("Insurance report.....");
        System.out.println("Insurance:"+vehicle.calculateInsurance());
        System.out.println("Road Tax:"+vehicle.calculateRoadTax());
        System.out.println("Total Charge:"+(vehicle.calculateInsurance()+vehicle.calculateRoadTax()));
    }
}
