package strategypattern;

public class FlexibleRouteCalculator {
    private RouteStrategy strategy;

    public FlexibleRouteCalculator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int distance) {
        return strategy.calculateTime(distance);
    }
}



