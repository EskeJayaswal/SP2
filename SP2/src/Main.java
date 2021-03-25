public class Main {

    public static void main(String[] args) {

        Garage myGarage = new Garage();
        Car volvo = new GasolineCar("1234","Volvo","C23",1974,5,4321,4);
        Car fiat = new DieselCar("2345","Fiat","500",2015,3,false,4);
        Car tesla = new ElectricalCar("3456","Tesla","T20",2020,5,5000,500,400);

        myGarage.addCars(volvo);
        myGarage.addCars(fiat);
        myGarage.addCars(tesla);

        myGarage.calculateGreenTaxForGarage();

        System.out.println(myGarage.toString());

    }
}
