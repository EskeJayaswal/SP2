public abstract class Car {
    private String licenseNumber;
    private String make;
    private String model;
    private int year;
    private int numberOfDoors;


    public Car(String licenseNumber, String make, String model, int year, int numberOfDoors) {
        this.licenseNumber = licenseNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }

    public abstract double calculateGreenTax();


    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
