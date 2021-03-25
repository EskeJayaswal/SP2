public class GasolineCar extends Car{
    protected int octaneNumber;
    protected int kmPrL;
    protected double greenTax;

    public GasolineCar(String licenseNumber, String make, String model, int year, int numberOfDoors, int octaneNumber, int kmPrL) {
        super(licenseNumber, make, model, year, numberOfDoors);
        this.octaneNumber = octaneNumber;
        this.kmPrL = kmPrL;
    }

    public int getOctaneNumber() {
        return octaneNumber;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setOctaneNumber(int octaneNumber) {
        this.octaneNumber = octaneNumber;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "GasolineCar{" + "LicenseNumber: " + super.getLicenseNumber() + ", Make: " +super.getMake()+ ", Model: "+super.getModel()+ ", Year: "+super.getYear()+ ", NumberOfDoor: "+super.getNumberOfDoors()+ ", OctaneNumber: " + octaneNumber + ", kmPrL=" + kmPrL + '}';
    }

    @Override
    public double calculateGreenTax() {

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
