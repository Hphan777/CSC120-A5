public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardCar(Car c) {
        try {
            c.addPassenger(this);
            
        } catch (Exception e) {
            System.err.println(e.getMessage()); // the car is full
        }
    }

    public void getOffCar(Car c) {
        try {
            c.removePassenger(this);
            
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Passenger wasn't actually onboard.
        }
    }

    public String getName(){
        return this.name;
    }

    // public static void main(String args[]){
    //     Car myCar = new Car(20);
    //     Passenger myPassenger = new Passenger("Hau");
    //     myCar.addPassenger(myPassenger);
    //     myCar.printManifest();
   // }
}
       
    

