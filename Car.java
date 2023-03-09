import java.util.ArrayList;

public class Car {

    private int maxCapacity;
    private ArrayList<Passenger> passengersOnboard;

    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>(maxCapacity);
    }

    public int getCapacity() {
        return maxCapacity;
    }

    public int seatsRemaining() {
        return maxCapacity - this.passengersOnboard.size();
    }

    public void addPassenger(Passenger p) {
        if (this.passengersOnboard.contains(p)) {
            throw new RuntimeException(p + "is already on the train");
        }
        if (this.seatsRemaining() <= 0) {
            throw new RuntimeException("no seats available.");
        }

        this.passengersOnboard.add(p);
        System.out.println( p + "was successfully added");
        
    } {

        if (this.passengersOnboard.contains(p)) {
            throw new RuntimeException(p + "is already on the train");
        }

    }
    public void removePassenger(Passenger p) {
        if (this.passengersOnboard.contains(p)) {
            throw new RuntimeException(p + "was not the train");
        }
    
        this.passengersOnboard.remove(p);
        System.out.println( p + "was successfully removed");

    }

    public void printManifest() {
        if (passengersOnboard.size() == 0) {
            System.out.println("No passenger on the train.");
        } else {
            for (Passenger name: passengersOnboard){
                System.out.println(name);
             }
        }
    } 
}
