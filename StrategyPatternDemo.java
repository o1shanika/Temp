// Interface defining the travel strategy
interface TravelStrategy {
    void travel(String destination);
}

// Implementation of TravelStrategy for traveling by car
class CarTravelStrategy implements TravelStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Travelling to " + destination + " by car");
    }
}

// Implementation of TravelStrategy for traveling by bicycle
class BicycleTravelStrategy implements TravelStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Travelling to " + destination + " by bicycle");
    }
}

// Implementation of TravelStrategy for traveling by train
class TrainTravelStrategy implements TravelStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Travelling to " + destination + " by train");
    }
}

// Implementation of TravelStrategy for traveling by plane
class PlaneTravelStrategy implements TravelStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Travelling to " + destination + " by plane");
    }
}

// Context class using a travel strategy
class Traveler {
    private TravelStrategy strategy;

    // Setter to change the strategy at runtime
    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    // Method to perform travel using the current strategy
    public void travel(String destination) {
        strategy.travel(destination);
    }
}

// Demo class to demonstrate the strategy pattern
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Traveler traveler = new Traveler();

        // Travel by car
        traveler.setStrategy(new CarTravelStrategy());
        traveler.travel("Colombo");

        // Travel by bicycle
        traveler.setStrategy(new BicycleTravelStrategy());
        traveler.travel("Pabahinna");

        // Travel by train
        traveler.setStrategy(new TrainTravelStrategy());
        traveler.travel("Kandy");

        // Travel by plane
        traveler.setStrategy(new PlaneTravelStrategy());
        traveler.travel("New York");
    }
}
