import java.util.ArrayList;

/**
 * The Car class represents a car in a Train system, which can hold passengers.
 */

public class Car {

    private int maxCapacity;
    private ArrayList<Passenger> passengersOnboard;

    /**
     * Constructs a Car object with a given maximum capacity.
     * @param maxCapacity - the maximum capacity of the Car
     */

    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>(maxCapacity);
    }

    /**
     * accessor for capacity
     * @return the maximum capacity of the car
     */

    public int getCapacity() {
        return maxCapacity;
    }

    /**
     * Returns the number of remaining seats in the car
     * @return the number of remaining seats 
     */

    public int seatsRemaining() {
        return maxCapacity - this.passengersOnboard.size();
    }

    /**
     * Adds a passenger to the Car's onboard list, if there is enough space.
     * @param p - the Passenger to be added
     * @throw RuntimeException if the Passenger is already on the Car or there is no available seat
     */

    public void addPassenger(Passenger p) {
        if (this.passengersOnboard.contains(p)) {
            throw new RuntimeException(p + "is already on the car");
        }
        if (this.seatsRemaining() <= 0) {
            throw new RuntimeException("no seats available.");
        }

        this.passengersOnboard.add(p); 
        System.out.println( p + "was successfully added");
        
    } { 

    }
    /**
     * Removes a passenger from the Car's onboard list.
     * @param p - the Passenger to be removed
     * @throw RuntimeException if the Passenger is not on the Car
     */

    public void removePassenger(Passenger p) {
        if (this.passengersOnboard.contains(p)) {
            throw new RuntimeException(p + "was not the train");
        }
    
        this.passengersOnboard.remove(p);
        System.out.println( p + " was successfully removed");

    }

    /**
     * Prints the list of passengers currently on the Car.
     */

    public void printManifest() {
        if (passengersOnboard.size() == 0) {
            System.out.println("No passenger on the train.");
        } else {
            for (Passenger name: passengersOnboard){
                System.out.println(name.getName());
             }
        }
    } 

    public static void main(String args[]){
        Car myCar = new Car(20);
        Passenger myPassenger = new Passenger("Hau");
        myCar.addPassenger(myPassenger);
        myCar.printManifest();

    }
}
