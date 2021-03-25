import java.util.ArrayList;

public class Garage {
    ArrayList<Car> cars = new ArrayList<>();

    public void addCars(Car car) {

        cars.add(car);
    }

    public void calculateGreenTaxForGarage() {

        int sum = 0;
        for(int i = 0; i < cars.size(); i++) {
            sum += cars.get(i).calculateGreenTax();
        }
        System.out.println("The total green tax for the cars in the garage is " +sum + "dkk");
    }

    @Override
    public String toString() {
        String str = "";
        for (Car c: cars) {
            str = str + c.toString()+ "\n";
        }
        return str;
    }
}
