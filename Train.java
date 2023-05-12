import java.util.ArrayList;

/**
 * The Train class represents a train consisting of an engine and multiple cars, each with its passenger capacity.
 */

public class Train {

    private final Engine engine;
    private ArrayList<Car> cars;
    private int nCars;

    /**
     * Constructs a Train with a given fuel type, fuel capacity, number of cars, and passenger capacity.
     * @param fueltype - the type of fuel the train uses
     * @param fuelCapacity -  fuelCapacity the maximum amount of fuel the train can hold
     * @param nCars - nCars the number of cars on the train
     * @param passengerCapacity - the maximum number of passengers each car can hold
     */

    public Train(FuelType fueltype, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = new Engine(fueltype, fuelCapacity);
        this.cars = new ArrayList<Car>();
        for (int i = 0; i < nCars; i++) {
            this.cars.add(new Car(passengerCapacity));
        }
        this.nCars = nCars;
    }
    /**
     * Accessor of engine
     * @return a new engine class for the train
     */

    public Engine getEngine() {
        return this.engine;
    }

    /**
     * Accessor of car
     * @param i - index of the car
     * @return return the `i`th car
     */

    public Car getCar(int i) {
        return this.cars.get(i - 1);
    }
    /**
     * Accessor for allcapacity 
     * @return return the maximum total capacity across all `Car`s
     */
   
    public int getmaxCapacity() {
        int maxCapacity = 0;
        for (int i = 0; i < nCars; i++) {
            maxCapacity+=this.getCar(i).getCapacity();
        
        }
         return maxCapacity; 
    }

    /**
     * Returns the number of remaining seats
     * @retunn return the number of remaining open seats across all `Car`s
     */
    
    public int seatsRemaining() {
        int remainingSeats = 0;
        for (int i = 0; i < nCars; i++) {
            remainingSeats += this.getCar(i).seatsRemaining();
        }
            return remainingSeats;
    }

    /**
     * Prints the list of passengers in the train.
     */

    public void printManifest() {
        if (cars.size()==0) {
            System.out.println("No passengers on the train");

        } else {
               for (Car everycar: cars) {
                everycar.printManifest();
               }
        }
    }

    public static void main(String args[]){

        Train myTrain= new Train(FuelType.STEAM, 20, 20, 20);
        myTrain.printManifest();

    }
}

