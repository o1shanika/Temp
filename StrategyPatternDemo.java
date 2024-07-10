interface TravelStrategy {
    void travel(String destination);
}

class CarTravelStrategy implements TravelStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Travelling to " + destination + " by car");
    }
}

class BicycleTravelStrategy implements TravelStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Travelling to " + destination + " by bicycle");
    }
}

class TrainTravelStrategy implements TravelStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Travelling to " + destination + " by train");
    }
}

class PlaneTravelStrategy implements TravelStrategy {
    @Override
    public void travel(String destination) {
        System.out.println("Travelling to " + destination + " by plane");
    }
}

class Traveler {
    private TravelStrategy strategy;

    
    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    
    public void travel(String destination) {
        strategy.travel(destination);
    }
}

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Traveler traveler = new Traveler();

        //  by car
        traveler.setStrategy(new CarTravelStrategy());
        traveler.travel("Colombo");

        //  by bicycle
        traveler.setStrategy(new BicycleTravelStrategy());
        traveler.travel("Pabahinna");

        //  by train
        traveler.setStrategy(new TrainTravelStrategy());
        traveler.travel("Kandy");

        //  by plane
        traveler.setStrategy(new PlaneTravelStrategy());
        traveler.travel("New York");
    }
}
