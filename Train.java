import java.util.ArrayList;

public class Train {

    private final Engine engine;
    private ArrayList<Car> cars;
    private int nCars;

    public Train(FuelType fueltype, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fueltype, fuelCapacity);
        this.cars = new ArrayList<Car>();
        for (int i = 0; i < nCars; i++) {
            this.cars.add(new Car(passengerCapacity));
        }
        this.nCars = nCars;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Car getCar(int i) {
        return this.cars.get(i - 1);
    }

   
    public int getCapacity() {
        int maxCapacity = 0;
        for (int i = 0; i < nCars; i++) {
            maxCapacity+=this.getCar(i).getCapacity();
        
        }
         return maxCapacity; 
    }
    
    public int seatsRemaining() {
        int remainingSeats = 0;
        for (int i = 0; i < nCars; i++) {
            remainingSeats += this.getCar(i).seatsRemaining();
        }
            return remainingSeats;
    }

    public void printManifest() {
        if (cars.size()==0) {
            System.out.println("No passengers on the train");

        } else {
               for (Car everycar: cars) {
                everycar.printManifest();
               }
        }
    }
}

