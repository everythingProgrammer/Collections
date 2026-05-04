package strategypattern.exercise;

public class RouteCalculator {

    private  RouteStrategy strategy;

    public RouteCalculator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculateTime(int distance){
        if(distance <0){
            return 0;
        }
        /*
            Any other checks
         */
        return strategy.calculateTime(distance);
    }
}
