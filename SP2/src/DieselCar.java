public class DieselCar extends Car{

    protected boolean hasParticleFilter;
    protected int kmPrL;
    protected double greenTax;

    public DieselCar(String licenseNumber, String make, String model, int year, int numberOfDoors, boolean hasParticleFilter, int kmPrL) {
        super(licenseNumber, make, model, year, numberOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "DieselCar{" + "LicenseNumber: " + super.getLicenseNumber() + ", Make: " +super.getMake()+ ", Model: "+super.getModel()+ ", Year: "+super.getYear()+ ", NumberOfDoor: "+super.getNumberOfDoors()+ ", HasParticleFilter: " + hasParticleFilter + ", kmPrL=" + kmPrL + '}';
    }

    @Override
    public double calculateGreenTax() {

        if (kmPrL >= 20 && kmPrL <= 50) {
            greenTax = 330 + 130;
            if (!hasParticleFilter) {
                greenTax = greenTax + 1000;
            }
        } else if (kmPrL >= 15 && kmPrL < 20) {
            greenTax = 1050 + 1390;
            if (!hasParticleFilter) {
                greenTax = greenTax + 1000;
            }
        } else if (kmPrL >= 10 && kmPrL < 15) {
            greenTax = 2340 + 1850;
            if (!hasParticleFilter) {
                greenTax = greenTax + 1000;
            }
        } else if (kmPrL >= 5 && kmPrL < 10) {
            greenTax = 5500 + 2770;
            if (!hasParticleFilter) {
                greenTax = greenTax + 1000;
            }
        } else if (kmPrL < 5) {
            greenTax = 10470 + 15260;
        }

        return  greenTax;
    }
}
