public class ElectricalCar extends Car {

    protected int batteryCapacityKWh;
    protected int maxKm;
    protected int whPrKm;
    protected double greenTax;

    public ElectricalCar(String licenseNumber, String make, String model, int year, int numberOfDoors, int batteryCapacityKWh, int maxKm, int whPrKm) {
        super(licenseNumber, make, model, year, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;

    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setBatteryCapacityKWh(int batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "ElectricalCar{" + "LicenseNumber: " + super.getLicenseNumber() + ", Make: " +super.getMake()+ ", Model: "+super.getModel()+ ", Year: "+super.getYear()+ ", NumberOfDoor: "+super.getNumberOfDoors()+ ", BatteryCapacityKWh: " + batteryCapacityKWh + ", maxKm: " + maxKm + ", whPrKm: " + whPrKm + '}';
    }

    @Override
    public double calculateGreenTax() {

        double kmPrL = 100/(whPrKm/91.25);

        if (kmPrL >= 20 && kmPrL <= 50) {
            greenTax = 330;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            greenTax = 1050;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            greenTax = 2340;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            greenTax = 5500;
        } else if (kmPrL < 5) {
            greenTax = 10470;
        }
        return greenTax;
    }
}
