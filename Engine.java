public class Engine {
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    public Engine(FuelType f, double maxFuelLevel) {
        this.f = f;
        this.currentFuelLevel = maxFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    
    }

    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }

    public void go() {
        if (currentFuelLevel > 0) {
            currentFuelLevel--;
            System.out.println("Remaining fuel level: "+ currentFuelLevel);
        } else {
            throw new RuntimeException("out of fuel");
        }
    }
   
    public static void main(String[] args) {

        Engine myEngine = new Engine(FuelType.ELECTRIC, 90.0);

        //try catch method to catch Exception when there is no more fuel in go();
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
    }

}