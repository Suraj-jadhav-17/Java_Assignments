package assignments.insurancesystem;

public  abstract class Vehicle implements Insurance {
    private String vehicleNumber;
    private String ownerName;
    private double price;
    private int year;
    private int airBagCount;
    public Vehicle(String vehicleNumber, String ownerName, double price, int year, int airBagCount) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.price = price;
        this.year = year;
        this.airBagCount = airBagCount;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getAirBagCount() {
        return airBagCount;
    }

    public void setAirBagCount(int airBagCount) {
        this.airBagCount = airBagCount;
    }
}
