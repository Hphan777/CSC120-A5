/**
 * The Engine class represents the engine of a train that has a fuel type and a maximum fuel level.
 */

public class Engine {
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**
     * Constructs a new Engine object with the specified fuel type and maximum fuel level.
     * @param f - the fuel type used by the engine.
     * @param maxFuelLevel - the maximum fuel level of the engine.
     */

    public Engine(FuelType f, double maxFuelLevel) {
        this.f = f;
        this.currentFuelLevel = maxFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    
    }

    /**
     * Refuels the engine to its maximum fuel level.
     */

    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }

    /**
     * Starts the engine, reducing its fuel level by 1 unit if there is enough fuel. 
     * Otherwise, throws a RuntimeException indicating that the engine is out of fuel.
     */

    public void go() {
        if (currentFuelLevel > 0) {
            currentFuelLevel--;
            System.out.println("Remaining fuel level: "+ currentFuelLevel);
        } else {
            throw new RuntimeException("out of fuel");
        }
    }
   
    // public static void main(String[] args) {
        
    //     Engine myEngine = new Engine(FuelType.ELECTRIC, 90.0);

    //     //try catch method to catch Exception when there is no more fuel in go();
    //     try {
    //         while (true) {
    //             myEngine.go();
    //         }
    //     } catch (Exception e) {
    //         System.err.println(e.getMessage()); // Out of fuel
    //     }
    }

//}